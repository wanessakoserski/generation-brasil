package br.com.generation.lista03;

public class newFeatureWhile {

	public static void main(String[] args) throws InterruptedException{
		
		int num = 10;
		
		while (num > 0)
		{
			System.out.println("Contagem..." + num);
			num--;
			
			Thread.sleep(500);
		}
		
		System.out.println("BOOOMM!");
		
	}

}
