package Ejercicio_01;

public class Coche extends Vehiculo{

	private String color, marca, modelo;
	
	public Coche(String color, String marca, String modelo) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	public String  aceleracion() {
		return "Este coche tiene una buena aceleracion";
	}
}
