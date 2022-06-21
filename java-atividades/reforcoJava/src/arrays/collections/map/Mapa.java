package arrays.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto"); //adicionou
		usuarios.put(1, "Ricardo"); //alterou
		
		System.out.println(usuarios.size());
		
		usuarios.put(2, "Rafaela");
		usuarios.put(30, "Roberto");
		
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(30));
		System.out.println(usuarios.containsValue("Rafaela"));
		
		System.out.println(usuarios.get(30));
		
		for (int chave: usuarios.keySet())
		{
			System.out.println(chave);
		}
		
		for (String valor: usuarios.values())
		{
			System.out.println(valor);
		}
		
		for (Entry<Integer, String> registro: usuarios.entrySet())
		{
			System.out.print(registro.getKey() + " ==> " + registro.getValue() + "\n");
		}

	}

}
