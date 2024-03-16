package Ejercicio_05;

public class Use_tiempo {

	public static void main(String[] args) {
		
		Tiempo t1 = new Tiempo(5,25,30);
		Tiempo t2 = new Tiempo(2,30,55);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println("La suma de t1 + t2 = " + t1.suma(t2));
		System.out.println("La resta de t1 - t2 = " + t1.resta(t2));
		
	}
}
