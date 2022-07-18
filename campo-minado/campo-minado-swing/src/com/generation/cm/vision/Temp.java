package com.generation.cm.vision;

import com.generation.cm.model.Board;

public class Temp {

	public static void main(String[] args) {
		
		Board board = new Board(3, 3, 9);
		
		board.registerObserver(e -> {
			if(e.isWinner()) {
				System.out.println("ganhour");
			}
			else {
				System.out.println("perdeu");
			}
		});
	
		board.addFlag(0, 0);
		board.addFlag(0, 1);
		board.addFlag(0, 2);
		
		board.addFlag(1, 0);
		board.addFlag(1, 1);
		board.addFlag(1, 2);
		// board.choose(2, 2);
		board.addFlag(2, 0);
		board.addFlag(2, 1);
		board.addFlag(2, 2);
		
		
	}
	
}
