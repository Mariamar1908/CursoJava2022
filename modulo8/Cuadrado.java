package modulo8;

//Con el extends indicas que es subclase de Figura
public class Cuadrado extends Figura  {

    float lado;

//Constructor con par�metros
	public Cuadrado(float l){
		this.lado = l;
	}

//Constructor sin par�metros		
	public Cuadrado(){
		this.lado = 0.00f;
	}

//Aqu� empezamos a declarar gets y sets (m�todos)
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
	
//Calcular Per�metro Cuadrado		
	public float calcPerimCuadrado(){
		float perimetro;
		perimetro = 4 * lado;
		return perimetro;
	}
	
//M�todo equals 	  
 	  public boolean equals(Object obj){		
 			return super.equals(obj) 	     &&
 					obj instanceof Cuadrado	 &&
 					lado == ((Cuadrado)obj).getLado();
 	   }
 	   
//M�todo hashCoded 	  
 	   public int hashCoded(){
 			return super.hashCode() + (int)lado;
 	   }
 		
//M�todo toString 	   
 	   public String toString(){
 	    	StringBuilder sb = new StringBuilder(super.toString());
 	    	sb.append(",lado=");
 	    	sb.append(lado);
 	    	return sb.toString();
 	   }	  		
}
