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
		 
//Comprueba si tiene dos o m�s espacios		
		boolean siesp = StringUtil.containsDobleSpace(cadena);
		
		if (siesp == true) {
			System.out.println("La cadena: ' " + cadena + " ' contiene dos o m�s espacios");
		}else {
			System.out.println("La cadena: ' " + cadena + " ' no contiene dos o m�s espacios");
		}
		
//Comprueba si hay n�meros en la cadena		
		boolean sitienenum = StringUtil.containsNumber(cadena);
		
		if (sitienenum == true) {
			System.out.println("La cadena: ' " + cadena + " ' contiene n�meros");
		}else {
			System.out.println("La cadena: ' " + cadena + " ' no contiene n�meros");
		}
		dato.close();
	}

}
