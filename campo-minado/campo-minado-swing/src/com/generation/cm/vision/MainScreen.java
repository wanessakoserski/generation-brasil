package com.generation.cm.vision;

import javax.swing.JFrame;

import com.generation.cm.model.Board;

@SuppressWarnings("serial")
public class MainScreen extends JFrame {
	
	public MainScreen() {
		Board board = new Board(16, 30, 50);
		BoardPanel panel = new BoardPanel(board);
		
		add(panel);
		
		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new MainScreen();
		
	}
	
}
