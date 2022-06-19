package fundamentos.estruturasControle;

public class RepeticaoSemNumero {
	
	public static void main(String[] args) {
		
		// com valor numérico
		String valor = "#";
		for (int i = 1; i <= 5; i++)
		{
			System.out.println(valor);
			valor += " #";
		}
		
		System.out.println("\n\nSem valor numérico: \n");
		
		// sem valor numérico
		for (String v = "#"; !v.equals("# # # # # #"); v += " #" )
		{
			System.out.println(v);
		}
		
	}
}
