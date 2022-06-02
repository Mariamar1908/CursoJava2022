package modulo3;

import java.util.Scanner;

public class Mod3_Ejercicio2 {

	public static void main(String[] args) {
		int numero = 0;

		Scanner dato = new Scanner(System.in);

		System.out.println("Introduzca un numero:\t");

//nextInt es para recoger un Integer
		numero = dato.nextInt();

//Mira el resto de una división y si es 0 (% con ésto nos da el resto)		
		if (numero % 2 == 0) {
			System.out.println("El numero:\t" + numero + "\tes PAR");
		} else {
			System.out.println("El numero:\t" + numero + "\tes IMPAR");
		}
		
		dato.close();

	}

}
