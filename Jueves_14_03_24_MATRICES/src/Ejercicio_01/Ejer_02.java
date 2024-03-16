package Ejercicio_01;

import java.util.Random;

public class Ejer_02 {
	
	public static void main(String[] args) {
		
		/*Realiza un programa que muestre por pantalla un array de 9 filas por 9 columnas relleno con 
		 * números aleatorios entre 500 y  900.  A  continuación,  el  programa  debe  mostrar  los números  
		 * de  la  diagonal  que  va  desde  la  esquina  inferior izquierda  a   la  esquina   superior   derecha,   
		 * así  como  el máximo, el mínimo y la media de los números que hay en esa diagonal*/
		
		int[][] numeros = new int [9][9];
		
		Random random = new Random();
		for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = random.nextInt(401) + 500;
            }
        }
		
		for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
		
		// Mostrar la diagonal invertida
        System.out.println("Diagonal invertida:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i][numeros.length - 1 - i] + " ");
        }
        System.out.println();
        
        int max = numeros[numeros.length - 1][0];
        int min = numeros[numeros.length - 1][0];
        int suma = 0;
        for(int i = numeros.length -1; i >= 0; i--) {
        	if (numeros[i][numeros.length - 1 - i] > max) {
                max = numeros[i][numeros.length - 1 - i];
            }
            if (numeros[i][numeros.length - 1 - i] < min) {
                min = numeros[i][numeros.length - 1 - i];
            }
            suma += numeros[i][numeros.length - 1 - i];
        }
        double media = (double) suma / numeros.length;
        
        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
        System.out.println("Media: " + media);
	}

}
