package Ejercicio_05;

public class Tiempo {

	private int segundos;
	
	public Tiempo(int h, int m, int s) {
		this.segundos = (h * 3600) + (m * 60) + s;
	}
	
	public Tiempo(int s) {
		this.segundos = s;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
    
	public Tiempo suma(Tiempo t) {
		return new Tiempo(this.segundos + t.getSegundos());
	}
	
	public Tiempo resta(Tiempo t) {
		return new Tiempo(this.segundos - t.getSegundos()); 
	}

	@Override
	public String toString() {
		int h = (int)(this.segundos / 3600);
		int s = this.segundos % 3600;
		int m = (int)(s / 60);
		s = s % 60;
		return String.format("Horas=%d Minutos=%d Segundos=%d", h, m, s);
	}
}