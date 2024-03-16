package Practica_01;

import java.util.ArrayList;

public class Ejer_02 {
	
	public static void main(String[] args) {
		
		int tb[] = {1,2,3,4,5};
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Jose");
		lista.add("Maria");
		lista.add(1, "Camila");
		lista.add("Samuel");
		lista.add("Ivan");
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		for (String l : lista) {
			System.out.println(l);
		}
		
		for (int n : tb) {
			System.out.println(n);
		}
		
		for (int i = 0; i < tb.length; i++) {
			System.out.println(tb[i]);
		}
	}
}
