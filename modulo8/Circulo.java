package modulo8;

//Con el extends indicas que es subclase de Figura
public class Circulo extends Figura {
	
	    double PI = 3.1416;
		double radio;

//Constructor con par�metros
		public Circulo(double r){
			this.radio = r;
		}

//Constructor sin par�metros		
		public Circulo(){
			this.radio = 0.0;
		}

//Aqu� empezamos a declarar gets y sets (m�todos)
		public double getRadio(){
			return this.radio;
		}		
		
		public void setRadio(double radio){
			this.radio = radio;
		}

//Calcular Superficie C�rculo 			
		public double CalcSupCirculo(){
			double area;
			area = PI *(radio*radio);
			return area;
		}
		
//Calcular Per�metro C�rculo		
		public double calcPerimCirculo(){
			double perimetro;
			perimetro = 2 * PI * radio;
			return perimetro;
		}
		
//M�todo equals 	  
	 	  public boolean equals(Object obj){		
	 			return super.equals(obj) 	     &&
	 					obj instanceof Circulo	 &&
	 					radio == ((Circulo)obj).getRadio();
	 	   }
	 	   
//M�todo hashCoded 	  
	 	   public int hashCoded(){
	 			return super.hashCode() + (int)radio;
	 	   }
	 		
//M�todo toString 	   
	 	   public String toString(){
	 	    	StringBuilder sb = new StringBuilder(super.toString());
	 	    	sb.append(",radio=");
	 	    	sb.append(radio);
	 	    	return sb.toString();
	 	   }	  		
}
