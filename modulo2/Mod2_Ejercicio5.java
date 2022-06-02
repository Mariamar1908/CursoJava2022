package modulo2;

public class Mod2_Ejercicio5 {
	
	  public static void main(String[] args) {
		  
// cast byte -> short -> int -> long -> float -> double
//       8   ->  16   -> 32  ->  64  -> 32    ->  64
		  byte b = 10;
		  short s = 25;
		  int i = 1200;
		  long l = 3456L;
		  
		  b = (byte) s;
		  System.out.println("mover de short a byte\t" + b);
		  
		  l = i;
		  System.out.println("mover de integer a long\t" + l);

//cast		  
	      b = (byte) i;
	      System.out.println("mover de integer a byte\t" + b);
	     
//cast	      
		  s = (short) i;
		  System.out.println("mover de integer a short\t" + s);
	  }
}
