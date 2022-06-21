package oo.compra;

public class Compra {
	
	public static void main(String[] args) {
		
		Sacola sacola1 = new Sacola();
		
		sacola1.nome = "Pedro";
		/*
		sacola1.itens.add(new Item("Led RGB", 2, 47.99));
		sacola1.itens.add(new Item("Colar de golfinho", 1, 156.25));
		sacola1.itens.add(new Item("Fone de ouvido", 1, 80));
		*/
		sacola1.adicionarItem(new Item("Led RGB", 2, 47.99));
		sacola1.adicionarItem(new Item("Colar de golfinho", 1, 156.25));
		sacola1.adicionarItem(new Item("Fone de ouvido", 1, 80));
		
		System.out.println(sacola1.itens.size());
		System.out.println(sacola1.obterValorTotal());
		
		
		
	}	
	
}
