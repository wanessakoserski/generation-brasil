package com.generation.cm.model;

import java.util.ArrayList;
import java.util.List;

public class Field {

	private final int line;
	private final int column;
	
	private boolean mine = false;
	private boolean chosen = false;
	private boolean flaged = false;
	
	private List<Field> neighbors = new ArrayList<>();
	
	Field(int line, int column) {
		this.line = line;
		this.column = column;
	}
	
	boolean addNeighbor(Field neighbor) {
		boolean differentLine = line != neighbor.line;
		boolean differentColumn = column != neighbor.column;
		boolean diagonal = differentLine && differentColumn;
		
		int deltaLine = Math.abs(line - neighbor.line);
		int deltaColumn = Math.abs(column - neighbor.column);
		int delta = deltaLine + deltaColumn;
		
		if(delta == 1 && !diagonal) { //acho que a diagonal não é necessária
			neighbors.add(neighbor);
			return true;
		} else if(delta == 2 && diagonal) {
			neighbors.add(neighbor);
			return true;
		} else {
			return false;
		}
	}
	
}
