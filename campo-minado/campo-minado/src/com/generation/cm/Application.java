package com.generation.cm;

import com.generation.cm.model.Board;

public class Application {

	public static void main(String[] args) {
		
		Board board = new Board(6, 6, 6);

		board.choose(3, 3);
		board.addFlag(3, 2);
		
		System.out.println(board);
		
	}

}
