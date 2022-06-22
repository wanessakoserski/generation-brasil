package oo.compra.desafio;

import java.util.ArrayList;
import java.util.List;

public class Client {

	String name;
	
	List<Purchase> carts = new ArrayList<Purchase>();
	
	Client (String name)
	{
		this.name = name;
	}
	
	int showCarts()
	{
		int total = 0;
		
		for (int i = 0; i < this.carts.size(); i++)
		{
			total++;
		}
		
		return total;
	}
	
}
