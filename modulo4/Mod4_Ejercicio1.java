package modulo4;

import java.util.Scanner;

public class Mod4_Ejercicio1 {

	public static void main(String[] args) {
		
		int numero = 0;

		Scanner dato = new Scanner(System.in);

		System.out.println("Introduzca tabla de multiplicar del:\t");

		numero = dato.nextInt();

//Utilizando Bucles anidados.
        System.out.println("Tabla de multiplicar del " + numero);
        for (int j = 1; j <= 10; j++) {
             System.out.println(numero  + " X " + j + " =\t" + numero*j);
        }
        
        dato.close();
        
	}    
}
