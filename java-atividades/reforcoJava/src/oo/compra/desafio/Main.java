package oo.compra.desafio;

public class Main {

	public static void main(String[] args) {
		
		var cellphone = new Product("Celular", 1030);
		var notebook = new Product("Lenovo", 2399.90);
		var phone = new Product("Fone de ouvido", 89.90);
		
		
		var maria = new Client("Maria Oliveira");
		
		
		var mariaCart1 = new Purchase(maria);
		
		System.out.println("\n-- Cart 1 --");
		mariaCart1.addItem(cellphone, 1);
		mariaCart1.addItem(notebook, 1);
		mariaCart1.addItem(phone, 1);
		mariaCart1.showItems();
		System.out.printf("Total: ");
		System.out.println(mariaCart1.totalShoppingCart());
		
		var mariaCart2 = new Purchase(maria);
		
		System.out.println("\n-- Cart 2 --");
		mariaCart2.addItem(new Item("Dress", 36.5, 2));
		mariaCart2.addItem(new Item("T-Shirt", 50, 3));
		mariaCart2.addItem(new Item("Jeans", 80.5, 2));
		mariaCart2.showItems();
		System.out.printf("Total: ");
		System.out.println(mariaCart2.totalShoppingCart());
		
		System.out.println("Maria has " + maria.showCarts() + " carts");
		
	}

}
