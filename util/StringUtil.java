package util;

public class StringUtil {

// Este método inspecciona el parámetro de entrada 
//a ver si contiene 2 espacios, si es así devuelve (true) y sino (false)

	public static boolean containsDobleSpace(String cadena) {
		
		int longitud = cadena.length();
		int cont_espacios = 0;

        for(int i = 0; i < longitud; i ++) {
        	
       	   if (cadena.charAt(i) == ' ') {
       		   cont_espacios ++;
       	   }
        }
		if (cont_espacios >= 2) {
		   return (true);
		}else {
			return (false);
		}
	}

// Este método inspecciona el parámetro de entrada 
//a ver si contiene números, si es así devuelve (true) y sino (false)
	public static boolean containsNumber(String cadena) {
	      
		int longitud = cadena.length();
		int cont_numeros = 0;
		
        for(int i = 0; i < longitud; i ++) {
        	
      	   if (Character.isDigit(cadena.charAt(i))) {
      		   cont_numeros ++; 
       	   }
        }
		if (cont_numeros >= 1) {
		   return (true);
		}else {
			return (false);
		}
	}
}

