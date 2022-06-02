package modulo4;

public class Mod4_Ejercicio3 {

	public static void main(String[] args) {

//Utilizando Bucles anidados.
// Nos extrae las tablas de multiplicar del 1 al 10		
		for (int i = 1; i <= 10; i++) {
             System.out.println("Tabla de multiplicar del " + i);
             for (int j = 1; j <= 10; j++) {  
                System.out.println(i  + " X " + j + " =\t" + i*j);
             }   
        }
      
	}
}
