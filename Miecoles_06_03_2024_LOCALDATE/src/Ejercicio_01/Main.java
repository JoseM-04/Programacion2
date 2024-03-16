package Ejercicio_01;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	
	public static LocalDate fecha() {
		
		LocalDate fecha = null;
		
		while(true){
			try {
				fecha = LocalDate.of(ale(2000, 2050), ale(1, 12), ale(1, 31));
				return fecha;
			}catch (DateTimeException e) {
				System.out.println(e.getMessage());
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}	
		}
	}
	
	public static int ale(int li, int ls) {
		return (int)(Math.random() * (ls -li + 1)) + li;
	}
	
	public static LocalDate viernes(LocalDate fecha) {
		
		while (fecha.getDayOfWeek() != DayOfWeek.FRIDAY){
			fecha = fecha.minusDays(1);
		}
		return fecha;
	}
	
	public static void main(String[] args) {
		
		ArrayList<LocalDate> lista = new ArrayList<LocalDate>();
		
		for (int i = 1; i < 26; i++) {
			lista.add(fecha());
		}
		
		for (LocalDate localDate : lista) {
			System.out.println(localDate + " " + localDate.getDayOfWeek());
		}

		//Ultimo viernea de cada mes
		System.out.println("");
		LocalDate fecha2 = LocalDate.now(), fecha3 = null;
		for (int i = 1; i <= 12; i++) {
			fecha3 = LocalDate.of(fecha2.getYear(), i, 1);
			fecha3 = fecha3.plusMonths(1).minusDays(1);
			fecha3 = viernes(fecha3);
			System.out.println(fecha3 + " " + fecha3.getDayOfWeek());
		}
	}
}
