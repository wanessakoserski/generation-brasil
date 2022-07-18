package com.generation.cm.model;

public class ResultEvent {

	private final boolean win;
	
	public ResultEvent(boolean win) {
		this.win = win;
	}
	
	public boolean isWinner() {
		return win;
	}
	
}
