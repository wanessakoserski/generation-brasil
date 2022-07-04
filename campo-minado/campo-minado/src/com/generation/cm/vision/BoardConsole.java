package com.generation.cm.vision;

import java.util.Scanner;

import com.generation.cm.exception.ExplosionException;
import com.generation.cm.exception.GoOutException;
import com.generation.cm.model.Board;

public class BoardConsole {

	private Board board;
	private Scanner input = new Scanner(System.in);
	
	public BoardConsole(Board board) {
		this.board = board;
		
		startGame();
	}
	
	private void startGame() {
		try {
			boolean keepRunning = true;
			
			while(keepRunning) {
				
				game();
				
				System.out.println("Outra partida? (S/n) ");
				String answer = input.nextLine();
				
				if("n".equalsIgnoreCase(answer)) {	
					keepRunning = false;
				} else {
					board.restart();
				}
				
			}
			
		} catch (GoOutException e) {
			System.out.println("Tchau");
		} finally {
			input.close();
		}
	}
	
	private void game() {
		try {
			
			while(!board.goalAchieved()) {
				System.out.println(board);
				
				 
			}
			
			System.out.println("Você conseguiu, não foi explodido!!! :)");
		} catch(ExplosionException e) {
			System.out.println("Você foi explodido :(");
		} finally {
			System.out.println("Fim de jogo\n");
		}
	}
	
}
