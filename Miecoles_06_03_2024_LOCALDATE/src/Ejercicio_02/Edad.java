package Ejercicio_02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class Edad {
	
public static LocalDate años(LocalDate fecha) {
		
		while (fecha.getDayOfWeek() != DayOfWeek.from(fecha)){
			fecha = fecha.plusYears(1);
		}
		return fecha;
	}
	
	public static void main(String[] args) {
		
		ArrayList<LocalDate> lista = new ArrayList<LocalDate>();
		LocalDate cumple = null;
		cumple = LocalDate.of(2004, 3, 12);
		
		for (int i = 1; i <= 10; i++) {
			cumple.plusYears(1);
			cumple = años(cumple);
			System.out.println(años(cumple) + " " + cumple.getDayOfWeek());
		}
	}

}
