package Ejercicio_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Uso_persona {

	public static void main(String[] args) {
		
		ArrayList<Persona>  lista = new ArrayList<Persona>();
		
		lista.add(new Persona("Pepe", 28));
		lista.add(new Persona("Juan", 28));
		lista.add(new Persona("Paco", 28));
		lista.add(new Persona("Lola", 12));
		lista.add(new Persona("Maria", 34));
		lista.add(new Persona("Jose", 24));
		lista.add(new Persona("Dani", 28));
		lista.add(new Persona("Carlos", 29));
		lista.add(new Persona("Luana", 20));
		lista.add(new Persona("Fabiana", 16));
		lista.add(new Persona("Flor", 18));
		lista.add(new Persona("Max", 17));
		
		Collections.sort(lista, new ordenar(1));
		
		for(Persona p : lista) System.out.println(p);
	}
}

class ordenar implements Comparator<Persona>{
	private int caso=1;
	public ordenar(int caso){this.caso=caso;}
 
	@Override
	public int compare(Persona p1, Persona p2) {
		int n;
		switch(this.caso){
		case 1:
			n = (int)Math.signum(p1.getEdad()-p2.getEdad());
			if (n == 0) {
			    return p1.getNombre().compareTo(p2.getNombre());
			}
			else {
				return n;
			}
		case 2:
			return (int)Math.signum(p2.getEdad()-p1.getEdad());
		case 3:
		    return p2.getNombre().compareTo(p1.getNombre());
		}
		   return p1.getNombre().compareTo(p2.getNombre());
	}
}


