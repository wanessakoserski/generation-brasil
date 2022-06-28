package streams;

public class MediaTeste {

	public static void main(String[] args) {
		
		Media media1 = new Media().adicionar(8.5).adicionar(6.5);
		Media media2 = new Media().adicionar(8.0).adicionar(10.0);
		
		System.out.println(media1.getValor());
		System.out.println(media2.getValor());
		
		double total = Media.combinar(media1, media2).getValor();
		System.out.println(total);
	}
	
}
