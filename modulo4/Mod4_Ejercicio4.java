package modulo4;


public class Mod4_Ejercicio4 {

// Extrae 10 números aleatorios (Math.random), los suma y calcula el promedio	
	public static void main(String[] args) {

        System.out.println("Números generados entre 0 y 10");
        
        int i = 0;
        
        int sumAleatorio = 0;
        
        while (i < 10){
        	
            int numAleatorio=(int) (Math.random()*10);
            
            sumAleatorio = sumAleatorio + numAleatorio;
            
            System.out.println(numAleatorio);
            
            i = i + 1;
        }
        System.out.println("La suma de todos los números aleatorios es:\t" + sumAleatorio);
                
        float promedio = (float)sumAleatorio/10;
        
        System.out.println ("El promedio es:\t" + promedio);
                
	}

}
