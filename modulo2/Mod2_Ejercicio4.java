package modulo2;

public class Mod2_Ejercicio4 {
	
	  public static void main(String[] args) {

		  byte b = 10;
		  short s = 20;
          int i = 30;
          long l = 40;
          
          int  sumabb = 0;
          int   sumabs = 0;
          long  sumabi = 0;
          long  sumaii = 0;
          long  sumasl = 0;
          
          sumabb = b + b;
          sumabs = b + s;
          sumabi = b + i;
          sumaii = i + i;
          sumasl = s + l;
          
		  System.out.println ("int-sumabb\t" + sumabb);
		  
		  System.out.println ("int-sumabs\t" + sumabs);
		  
		  System.out.println ("long-sumabi\t" + sumabi);
		  
		  System.out.println ("long-sumaii\t" + sumaii);
		  
		  System.out.println ("long-sumasl\t" + sumasl);
        
	  }
}
