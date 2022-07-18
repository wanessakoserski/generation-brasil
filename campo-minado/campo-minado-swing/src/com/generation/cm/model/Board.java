package com.generation.cm.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Board implements FieldObserver{

	private final int lines;
	private final int columns;
	private final int mines;
	
	private final List<Field> fields = new ArrayList<>();
	private final List<Consumer<ResultEvent>> observers = new ArrayList<>();

	public Board(int lines, int columns, int mines) {
		this.lines = lines;
		this.columns = columns;
		this.mines = mines;
		
		generateFields();
		seeNeighbors();
		randomizeMines();
	}
	
	public void registerObserver(Consumer<ResultEvent> observer) {
		observers.add(observer);
	}
	
	private void notifyObservers(boolean result) {
		observers.stream().forEach(obs -> obs.accept(new ResultEvent(result)));
	}
	
	public void choose(int line, int column) {
		fields.parallelStream()                   // tornar a busca mais rápida
				.filter(f -> f.getLine() == line && f.getColumn() == column)
				.findFirst()								 // tornar o resultado para o java como unico (Optinal)
				.ifPresent(f -> f.choose());     
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
				Field field = new Field(i, j);
				field.registerObserver(this);
				fields.add(field);
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

	@Override
	public void eventOccurred(Field field, FieldEvent event) {
		if(event == FieldEvent.EXPLODE) {
			showMines();
			notifyObservers(false);
		} else if(goalAchieved()) {
			notifyObservers(true);
		}
			
	}
	
	private void showMines() {
		 fields.stream()
		 		.filter(f -> f.isMined())
		 		.forEach(f -> f.setChosen(true));
	}

	public int getLines() {
		return lines;
	}

	public int getColumns() {
		return columns;
	}
	
	public void ForEach(Consumer<Field> function) {
		fields.forEach(function);
	}
	
}
