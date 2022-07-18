package com.generation.cm.vision;

import java.awt.GridLayout;

import javax.swing.JPanel;

import com.generation.cm.model.Board;

@SuppressWarnings("serial")
public class BoardPanel extends JPanel {

	public BoardPanel(Board board) {
		setLayout(new GridLayout(board.getLines(), board.getColumns()));
			
		board.ForEach(c -> add(new FieldButton(c)));
		
		board.registerObserver(e -> {
			// TODO mostrar resultado para o usuário 
		});
	}
	
}
