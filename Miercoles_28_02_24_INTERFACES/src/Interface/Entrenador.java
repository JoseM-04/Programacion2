package Interface;

public class Entrenador extends SeleccionFutbol {
	
	private int idFederacion;

	public Entrenador(int id, int edad, String nombre, String apellidos, int idFederacion) {
		super(id, edad, nombre, apellidos);
		this.idFederacion = idFederacion;
	}

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}

	@Override
	public String toString() {
		String cadena = "Entrenador [idFederacion=" + idFederacion + "]";
		cadena += "\n" + super.toString();
		return cadena;
	}
	
	@Override
	public void concentrarse() {
		System.out.println("Concentrarse (Clase Entrenador)");
	}

	@Override
	public void viajar() {
		System.out.println("Viajar (Clase Entrenador)");
	}

	@Override
	public void entrenar() {
		System.out.println("Entrenarse (Clase Entrenador)");
	}

	@Override
	public void jugarPartido() {
		System.out.println("Asistir al partido (Clase Entrenador)");
	}

}
