package modulo8;

//Con el extends indicas que es subclase de Figura
public class Cuadrado extends Figura  {

    float lado;

//Constructor con parámetros
	public Cuadrado(float l){
		this.lado = l;
	}

//Constructor sin parámetros		
	public Cuadrado(){
		this.lado = 0.00f;
	}

//Aquí empezamos a declarar gets y sets (métodos)
	public float getLado(){
		return this.lado;
	}		
	
	public void setLado(float lado){
		this.lado = lado;
	}

//Calcular Superficie Cuadrado		
	public float CalcSupCuadrado(){
		float area;
		area = lado * lado;
		return area;
	}
	
//Calcular Perímetro Cuadrado		
	public float calcPerimCuadrado(){
		float perimetro;
		perimetro = 4 * lado;
		return perimetro;
	}
	
//Método equals 	  
 	  public boolean equals(Object obj){		
 			return super.equals(obj) 	     &&
 					obj instanceof Cuadrado	 &&
 					lado == ((Cuadrado)obj).getLado();
 	   }
 	   
//Método hashCoded 	  
 	   public int hashCoded(){
 			return super.hashCode() + (int)lado;
 	   }
 		
//Método toString 	   
 	   public String toString(){
 	    	StringBuilder sb = new StringBuilder(super.toString());
 	    	sb.append(",lado=");
 	    	sb.append(lado);
 	    	return sb.toString();
 	   }	  		
}
