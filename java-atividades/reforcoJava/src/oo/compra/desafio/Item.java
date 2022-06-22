package oo.compra.desafio;

public class Item {

	Product product;
	int amount;
	
	Item(Product product, int amount)
	{
		this.product = product;
		this.amount = amount;
	}
	
	Item(String name, double price, int amount)
	{
		Product newProduct = new Product (name, price);
		this.product = newProduct;
		this.amount = amount;
	}
	
}
