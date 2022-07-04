package com.generation.cm.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.generation.cm.exception.ExplosionException;

public class Board {

	private int lines;
	private int columns;
	private int mines;
	
	private final List<Field> fields = new ArrayList<>();

	public Board(int lines, int columns, int mines) {
		this.lines = lines;
		this.columns = columns;
		this.mines = mines;
		
		generateFields();
		seeNeighbors();
		randomizeMines();
	}
	
	public void choose(int line, int column) {
		 try {
			 fields.parallelStream()                   // tornar a busca mais rápida
				.filter(f -> f.getLine() == line && f.getColumn() == column)
				.findFirst()								 // tornar o resultado para o java como unico (Optinal)
				.ifPresent(f -> f.choose());     
		 } catch(ExplosionException e) {
			 fields.forEach(f -> f.setChosen(true));
			 
			 throw e;
		 }
	}
	
	public void addFlag(int line, int column) {
		fields.parallelStream()                   // tornar a busca mais rápida
			.filter(f -> f.getLine() == line && f.getColumn() == column)
			.findFirst()								 // tornar o resultado para o java como unico (Optinal)
			.ifPresent(f -> f.addFlag());                          
	}

	private void generateFields() {
		for(int i = 0; i < lines; i++) {
			for(int j = 0; j < columns; j++) {
				fields.add(new Field(i, j));
			}
		}
	}
	
	private void seeNeighbors() {
		for(Field fieldInFistList: fields) {
			for(Field fieldInSecondList: fields) {
				fieldInFistList.addNeighbor(fieldInSecondList);
			}
		}
	}
	
	private void randomizeMines() {
		long definedMines = 0;
		Predicate<Field> mined = f -> f.isMined();
		
		do {
			int randomIndex = (int) (Math.random() * fields.size());
			fields.get(randomIndex).addMine();
			
			definedMines = fields.stream().filter(mined).count();
		} while(definedMines < mines);
	}
	
	public boolean goalAchieved() {
		return fields.stream().allMatch(f -> f.checkGoals());
	}
	
	public void restart() {
		fields.stream().forEach(f -> f.restart());
		randomizeMines();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int index = 0;
		sb.append("\t");
		for(int j = 0; j < columns; j++) {
			if(j < 10) {
				sb.append("0" + j + "\t"); 
			} else {
				sb.append( j + "\t"); 
			}
		}
		
		sb.append("\n");
		
		for(int i = 0; i < lines; i++) {
			if(i < 10) {
				sb.append("0" + i + "\t");
			} else {
				sb.append(i + "\t");
			}
			for(int j = 0; j < columns; j++) {
				
				sb.append(" " + fields.get(index) + " ");
				sb.append("\t");
				
				index++;
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
}
