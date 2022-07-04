package com.generation.cm.vision;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
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
				
				System.out.println("\nOutra partida? (S/n) ");
				String answer = input.nextLine();
				
				if("n".equalsIgnoreCase(answer)) {	
					keepRunning = false;
				} else {
					board.restart();
				}
				
			}
			
		} catch (GoOutException e) {
			System.out.print("Tchau");
		} finally {
			input.close();
		}
	}
	
	private void game() {
		try {
			
			while(!board.goalAchieved()) {
				System.out.println("\n" + board);
				
				 String typed = captureTypedValue("Digite (x, y): ");
				 try {
					 
					 Iterator<Integer> xy = Arrays.stream(typed.split(","))
			 					.map(e -> Integer.parseInt(e.trim()))
			 					.iterator();
			 
					 typed = captureTypedValue("Digite 1 - abrir ou 2 - (des)marcar: ");
					 
					 if("1".equals(typed)) {
						 board.choose(xy.next(), xy.next());
					 } else if ("2".equals(typed)) {
						 board.addFlag(xy.next(), xy.next());
					 }
					 
				 } catch(NoSuchElementException e) {
					 	System.out.println("Entrada inválida, tente novamente");
					 	continue;
				 }
				 
			}
			System.out.println("\n" + board);
			System.out.print("Você conseguiu, não foi explodido!!! :)");
		} catch(ExplosionException e) {
			System.out.println(board);
			System.out.print("Você foi explodido :(");
		} finally {
			System.out.println("\nFim de jogo");
		}
	}
	
	private String captureTypedValue(String text) {
		System.out.print(text);
		String typed = input.nextLine();
		
		if("sair".equalsIgnoreCase(typed)) {
			throw new GoOutException();
		}
		
		return typed;
	}
	
}
