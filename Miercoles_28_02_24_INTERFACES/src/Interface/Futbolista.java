package Interface;

public class Futbolista extends SeleccionFutbol {
	
	private int dorsal;
	private String demarcacion;
	
	public Futbolista(int id, int edad, String nombre, String apellidos, int dorsal, String demarcacion) {
		super(id, edad, nombre, apellidos);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	@Override
	public String toString() {
		StringBuffer cadena = new StringBuffer("F [dorsal=" + dorsal + "\n");
		cadena.append(" demarcacion=" + demarcacion + "\n");
		cadena.append(" " + super.toString());
		return cadena.toString();
	}

	@Override
	public void concentrarse() {
		System.out.println("Concentrarse (Clase Futbolista)");
	}

	@Override
	public void viajar() {
		System.out.println("Viajar (Clase Futbolista)");
	}

	@Override
	public void entrenar() {
		System.out.println("Entrenarse (Clase Futbolista)");
	}

	@Override
	public void jugarPartido() {
		System.out.println("Asistir al partido (Clase Futbolista)");
	}
}
