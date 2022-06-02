package modulo3;

import java.util.Scanner;

public class Mod3_Ejercicio3 {
	
	  public static void main(String[] args) {
		  
         String mes;
                  
 	  	 Scanner dato = new Scanner(System.in);

 		 System.out.println("Introduzca mes:\t");

//next() recoge String, toUpperCase pasa a mayúsculas, toLowerCase pasa a minúsculas 		 
 		 mes = dato.next().toUpperCase();

 		 if (mes.equals("NOVIEMBRE") || mes.equals("ABRIL") || mes.equals("JUNIO")||
 			 mes.equals("SEPTIEMBRE")) {
 			System.out.println("El mes de \t" + mes.toLowerCase() + "\ttiene 30 días" );
 		 }else if (mes.equals("FEBRERO")){
 			System.out.println("El mes de \t" + mes.toLowerCase() + "\ttiene 28 días" );
 		 }else{
 			System.out.println("El mes de \t" + mes.toLowerCase() + "\ttiene 31 días" ); 
 		 }
 		 
 		dato.close();
	  }
	  
}
