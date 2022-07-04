package com.generation.cm;

import com.generation.cm.model.Board;
import com.generation.cm.vision.BoardConsole;

public class Application {

	public static void main(String[] args) {		
		
		Board board = new Board(6, 6, 6);
		
		new BoardConsole(board);		
		
	}

}
