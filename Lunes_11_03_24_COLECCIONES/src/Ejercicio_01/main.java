package Ejercicio_01;

import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Collections;

public class main {

	public static int alea(int li, int ls) {
		return (int)(Math.random() * (ls - li + 1) + li);
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for(int i = 1; i <= 25; i++) {
			lista.add(alea(1, 10));
		}
		
		Collections.sort(lista);
		
		for(Integer l : lista) {
			System.out.println(l);
		}
	}
}
