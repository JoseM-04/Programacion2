package Ejercicio_03;

import java.util.HashMap;
import java.util.Scanner;

public class Area_restringida {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int intentos = 0;
		String usuario, contraseña;
		HashMap<String, String> lista = new HashMap<String, String>();
		
		lista.put("Jose", "123456");
		lista.put("Ana", "123456");
		lista.put("Carla", "123456");
		
		for(intentos = 1; intentos <=3; intentos++) {
		
			System.out.println("Dime el usuario");
			usuario = sc.nextLine();
			
			System.out.println("Dime la contraseña");
			contraseña = sc.nextLine();
			
			if (lista.containsKey(usuario)) {
				if (lista.get(usuario).compareToIgnoreCase(contraseña) == 0) {
					System.out.println("Ha accedido al area restringuida");
					break ;
				}
				else {
					System.out.println("La contraseña no coincide");
				}
			}
			else {
				System.out.println("El usuario no existe");
			}
		}
		
		if (intentos == 4) {
			System.out.println("Demasiados intentos");
		}
		else {
			System.out.println("Paso en el intento " + intentos);
		}
	}
}
