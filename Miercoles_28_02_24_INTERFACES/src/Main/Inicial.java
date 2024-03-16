package Main;

import Interface.Entrenador;
import Interface.Futbolista;

public class Inicial {
	
	public static void main(String[] args) {
		Futbolista rayo = new Futbolista(1, 40, "Jose Manuel", "Rayo", 4, "medio");
		Entrenador pepe = new Entrenador(2, 60, "Pepe", "Perez", 47851);
		rayo.entrenar();
		rayo.concentrarse();
		rayo.jugarPartido();
		rayo.viajar();
	}

}
