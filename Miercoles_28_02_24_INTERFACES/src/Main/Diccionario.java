package Main;

import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		HashMap<String, String> lista = new HashMap<String, String>();
		String castellano, ingles;
		
		while(true) {
			
			System.out.println("Dime la palabra en castellano : ");
			castellano = sc.nextLine();
			
			if (castellano.compareToIgnoreCase("FIN")==0) break;
			
			if (lista.containsKey(castellano)) {
				System.out.println("La traduccion es " + lista.get(castellano));
			}
			else {
				System.out.println("Dime la traduccion :");
				ingles = sc.nextLine();
				lista.put(castellano, ingles);
			}
		}
	}

}
