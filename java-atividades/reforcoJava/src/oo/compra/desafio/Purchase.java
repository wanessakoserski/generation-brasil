package oo.compra.desafio;

import java.util.ArrayList;
import java.util.List;

public class Purchase {
	
	Client client;
	List<Item> items = new ArrayList<Item>();
	
	Purchase (Client client)
	{
		this.client = client;
		this.client.carts.add(this);
	}
	
	void addItem(Item item)
	{
		this.items.add(item);
	}
	
	void addItem(Product product , int amount )
	{
		this.items.add(new Item(product, amount));
	}
	
	double totalShoppingCart()
	{
		double total = 0;
		
		for(Item item: items)
		{
			total += item.product.price * item.amount;
		}
		
		return total;
	}
	
	void showItems()
	{
		for (Item item: this.items)
		{
			System.out.printf("* %d  %s (%.2f)\n", item.amount, item.product.name, item.product.price);
		}
	}
	
}
