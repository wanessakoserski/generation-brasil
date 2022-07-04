package com.generation.cm.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FieldTest {
	
	private Field field;
	
	@BeforeEach
	void initField() {
		field = new Field(3, 3);
	}
	

	@Test
	void tryNeighborTrue() {
		Field neighbor;
		
		for(int i = 2; i <= 4; i++)
		{
			for(int j = 2; j <= 4; j++)
			{
				if (i != 3 || j != 3) { 
					// se colocar && ele vai entender que em qualquer caso que exista um 3 é falso
					// meu objetivo é apenas quando ambos forem 3 e 3
					// então colocou || para que os casos em que apenas um deles é 3, também seja verdadeiro
					
					neighbor = new Field(i, j);
					
					boolean result = field.addNeighbor(neighbor);
					assertTrue(result);
				}
			}
		}		
	}
	
	
	@Test
	void tryNeighborFalseBefore() {
		Field neighbor;
		 
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 6; j++)
			{
					neighbor = new Field(i, j);
					
					boolean result = field.addNeighbor(neighbor);
					assertFalse(result);
				}
			}
		}
	
	@Test
	void tryNeighborFalseAfter() {
		Field neighbor;
		
		for(int i = 5; i < 6; i++)
		{
			for(int j = 0; j < 6; j++)
			{
					neighbor = new Field(i, j);
					
					boolean result = field.addNeighbor(neighbor);
					assertFalse(result);
				}
			}
		}
	
	
	@Test
	void tryNeighborFalseSame() {
		Field neighbor = new Field(3, 3);
					 
		boolean result = field.addNeighbor(neighbor);
		assertFalse(result);
		}
	
	@Test
	void tryStandardFlag() {		
		assertFalse(field.isFlaged());
	}
	
	@Test
	void tryChangedFlag() {
		field.addFlag();
		field.addFlag();
		field.addFlag();
		
		// assertFalse(field.isFlaged());
		assertTrue(field.isFlaged());
	}
	
}