package Ejercicio_01;

import java.util.Random;

public class Ejer_03 {
	
	public static void main(String[] args) {
		
		String [] pais = {"España", "Rusia", "Japon", "Australia"};
		
		int [][] estaturas = new int[pais.length][10];
		
		//Simulamos las estaturas
		Random random = new Random();
		for (int i = 0; i < estaturas.length; i++) {
            for (int j = 0; j < estaturas[i].length; j++) {
                estaturas[i][j] = random.nextInt(71) + 140;
            }
        }
		
		for (int i = 0; i < pais.length; i++) {
            int total = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < estaturas[i].length; j++) {
                total += estaturas[i][j];
                if (estaturas[i][j] < min) {
                    min = estaturas[i][j];
                }
                if (estaturas[i][j] > max) {
                    max = estaturas[i][j];
                }
            }
            int media = total / estaturas[i].length;
            
            // Mostrar resultados
            System.out.println("País: " + pais[i]);
            System.out.println("Estatura media: " + media + " cm");
            System.out.println("Estatura mínima: " + min + " cm");
            System.out.println("Estatura máxima: " + max + " cm");
            System.out.println();
		}
		
	}

}
