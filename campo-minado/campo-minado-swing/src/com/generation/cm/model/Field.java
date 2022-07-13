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
		
		if(delta == 1) { //acho que a diagonal não é necessária
			neighbors.add(neighbor);
			return true;
		} else if(delta == 2 && diagonal) {
			neighbors.add(neighbor);
			return true;
		} else {
			return false;
		}
	}
	
	
	void addFlag() {
		
		if(!chosen) {
			flaged = !flaged;
		}
		
	}
	
	void addMine() {
		mine = true;
	}
	
	
	boolean choose() {
		
		if(!chosen && !flaged) {			
			chosen = true;
			
			if(mine) {
				// TODO Implementar nova versão
			}
			
			if(saveNeighbors()) {
				neighbors.forEach(v -> v.choose());
			}
			
			return true;		
		} else {			
			return false;			
		}
		
	}
	
	boolean saveNeighbors() {
		
		return neighbors.stream().noneMatch(v -> v.mine);
		
	}
	
	public boolean isFlaged() {
		return flaged;
	}
	
	public boolean isOpened() {
		return chosen;
	}
	
	public boolean isClosed() {
		return !chosen;
	}
	
	public boolean isMined() {
		return mine;
	}
	
	void setChosen(boolean chosen) {
		this.chosen = chosen;
	}
	
	public int getLine() {
		return line;
	}
	
	public int getColumn() {
		return column;
	}
	
	boolean checkGoals() {
		boolean correctMove = !mine && chosen;
		boolean protectField = mine && flaged;
		return correctMove || protectField;
	}
	
	long minedNeighborhood() {
		return neighbors.stream().filter(v -> v.mine).count();
	}
	
	void restart() {
		chosen = false;
		mine = false;
		flaged = false;
	}
	

	
}
