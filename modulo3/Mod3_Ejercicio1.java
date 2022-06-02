package modulo3;

public class Mod3_Ejercicio1 {

	  public static void main(String[] args) {

		float nota1 = 7.3F;
		float nota2 = 5.6F;
		float nota3 = 4.5F;
		float promedio;
		
		promedio = (nota1+nota2+nota3)/3;
		
		System.out.println("El promedio de la nota es:\t" + promedio);
		
		if (promedio >= 7) {
			System.out.println("Aprobado");
		}	else {
				System.out.println("Reprobado");
		}		
	  }	
	
	  
}
