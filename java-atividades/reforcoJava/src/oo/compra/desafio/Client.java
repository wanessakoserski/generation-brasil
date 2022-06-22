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
	
}
