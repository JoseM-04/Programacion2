package Ejercicio_04;

import java.util.HashMap;
import java.util.Scanner;

public class Capitales {
	
	public static String obtenerCapital(String pais, HashMap<String, String> capitales) {
		return capitales.get(pais);
	}
	
	public static void guardarCapital(String pais, String capital, HashMap<String, String> capitales) {
		capitales.put(pais, capital);
	}
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		HashMap<String, String> capitales = new HashMap<String, String>();
		capitales.put("España", "Madrid");
		capitales.put("Portugal", "Lisboa");
		capitales.put("Francia", "Paris");
		
		while(true) {
			System.out.println("Introduce el nombre de un pais : ");
			String pais = sc.nextLine();
			
			if (pais.equalsIgnoreCase("salir")) {
				break;
			}
			
			String capital = obtenerCapital(pais, capitales);
			
			if (capital == null) {
				System.out.println("No conozco la capital de " + pais);
				System.out.println("¿Cual es la capital de  " + pais + "?");
				String newCapital = sc.nextLine();
				guardarCapital(pais, newCapital, capitales);
				System.out.println("Capital guardada!!!");
			}
			else {
				System.out.println("La capital de " + pais + " es  " + capital);
			}
		}
		sc.close(); 
	}
}
