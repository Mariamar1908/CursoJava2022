package modulo8;

//Con el extends indicas que es subclase de Figura
public class Circulo extends Figura {
	
	    double PI = 3.1416;
		double radio;

//Constructor con parámetros
		public Circulo(double r){
			this.radio = r;
		}

//Constructor sin parámetros		
		public Circulo(){
			this.radio = 0.0;
		}

//Aquí empezamos a declarar gets y sets (métodos)
		public double getRadio(){
			return this.radio;
		}		
		
		public void setRadio(double radio){
			this.radio = radio;
		}

//Calcular Superficie Círculo 			
		public double CalcSupCirculo(){
			double area;
			area = PI *(radio*radio);
			return area;
		}
		
//Calcular Perímetro Círculo		
		public double calcPerimCirculo(){
			double perimetro;
			perimetro = 2 * PI * radio;
			return perimetro;
		}
		
//Método equals 	  
	 	  public boolean equals(Object obj){		
	 			return super.equals(obj) 	     &&
	 					obj instanceof Circulo	 &&
	 					radio == ((Circulo)obj).getRadio();
	 	   }
	 	   
//Método hashCoded 	  
	 	   public int hashCoded(){
	 			return super.hashCode() + (int)radio;
	 	   }
	 		
//Método toString 	   
	 	   public String toString(){
	 	    	StringBuilder sb = new StringBuilder(super.toString());
	 	    	sb.append(",radio=");
	 	    	sb.append(radio);
	 	    	return sb.toString();
	 	   }	  		
}
