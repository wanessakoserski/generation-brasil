package com.generation.cm.model;

import java.util.ArrayList;
import java.util.List;

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
		
	}
	
}
