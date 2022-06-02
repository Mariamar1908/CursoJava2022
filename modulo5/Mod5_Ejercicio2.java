package modulo5;

public class Mod5_Ejercicio2 {

	public static void main(String[] args) {

         String lintexto = "Curso de Java";

//lenght nos calcula la longitud         
         int longitud = lintexto.length();
         
         System.out.println("La cadena es: " + lintexto);
         System.out.println("La longitud de la cadena es: " + longitud); 
         System.out.println("La cadena caracter a caracter es:\n");

//charArt(i) nos extrae caracter a caracter         
         for(int i = 0; i < longitud; i ++) {
        	 System.out.println(lintexto.charAt(i)); 
         }
        	 
	}

}
