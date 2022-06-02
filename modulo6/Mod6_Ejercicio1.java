package modulo6;

import java.util.Scanner;

import util.StringUtil;

public class Mod6_Ejercicio1 {

	public static void main(String[] args) {
		String cadena;

		Scanner dato = new Scanner(System.in);

		System.out.println("Introduzca una cadena:\t");
		
//nextLine nos recoge linea de texto
		cadena = dato.nextLine();
		 
//Comprueba si tiene dos o más espacios		
		boolean siesp = StringUtil.containsDobleSpace(cadena);
		
		if (siesp == true) {
			System.out.println("La cadena: ' " + cadena + " ' contiene dos o más espacios");
		}else {
			System.out.println("La cadena: ' " + cadena + " ' no contiene dos o más espacios");
		}
		
//Comprueba si hay números en la cadena		
		boolean sitienenum = StringUtil.containsNumber(cadena);
		
		if (sitienenum == true) {
			System.out.println("La cadena: ' " + cadena + " ' contiene números");
		}else {
			System.out.println("La cadena: ' " + cadena + " ' no contiene números");
		}
		dato.close();
	}

}
