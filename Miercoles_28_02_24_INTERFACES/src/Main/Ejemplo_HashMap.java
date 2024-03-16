package Main;

import java.util.HashMap;
import java.util.Map.Entry;

public class Ejemplo_HashMap {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> lista = new HashMap<String, Integer>();
		
		lista.put("Peras", 10);
		lista.put("Manzanas", 12);
		lista.put("Naranjas", 14);
		lista.put("Melocotones", 16);
		
		lista.put("Manzanas", 18);
		
		lista.remove("Peras");
		lista.remove("Uvas");
		
		if (lista.containsKey("Manzanas")) {
			System.out.println("Existen las manzanas");
		}
		else {
			System.out.println("No existen las manzanas");
		}
		
		for(String key : lista.keySet())
			System.out.println(key + " " + lista.get(key));
		
		for(Integer valor : lista.values())
			System.out.println(valor);
		
		for(Entry<String,Integer> elemento : lista.entrySet())
			System.out.println(elemento.getKey() + " " + elemento.getValue());
		
		System.out.println("Nº de elementos es " + lista.size());
	}

}
