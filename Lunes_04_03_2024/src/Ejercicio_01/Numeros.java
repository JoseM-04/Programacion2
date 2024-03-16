package Ejercicio_01;

import java.util.Scanner;

public class Numeros {
	
	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Introduzca un número entre 0 y 255: ");
	        int numeroDecimal = scanner.nextInt();

	        if (numeroDecimal < 0 || numeroDecimal > 255) {
	            System.out.println("El número introducido no está entre 0 y 255.");
	            return;
	        }

	        String binario = Integer.toBinaryString(numeroDecimal);
	        System.out.println("Binario: " + binario);

	        String hexadecimal = Integer.toHexString(numeroDecimal);
	        System.out.println("Hexadecimal: " + hexadecimal);

	        String octadecimal = Integer.toOctalString(numeroDecimal);
	        System.out.println("Octadecimal: " + octadecimal);
	    }
}
