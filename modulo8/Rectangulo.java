package modulo8;

//Con el extends indicas que es subclase de Figura
public class Rectangulo extends Figura{
    float base;
    float altura;

//Constructor con parámetros
	public Rectangulo(float b,float a){
		this.base = b;
		this.altura = a;
	}

//Constructor sin parámetros		
	public Rectangulo(){
		this.base = 0.00f;
		this.altura = 0.00f;
	}

//Aquí empezamos a declarar gets y sets (métodos)
	public float getBase(){
		return this.base;
	}		
	
	public void setBase(float base){
		this.base = base;
	}

	public float getAltura(){
		return this.altura;
	}		
	
	public void setAltura(float altura){
		this.altura = altura;
	}
	
//Calcular Superficie Rectangulo		
	public double CalcSupRectangulo(){
		double area;
		area = base * altura;
		return area;
	}
	
//Calcular Perímetro Rectangulo		
	public double calcPerimRectangulo(){
		double perimetro;
		perimetro = (2 * base) + (2 * altura);
		return perimetro;
	}
	
//Método equals 	  
 	  public boolean equals(Object obj){		
 			return super.equals(obj) 	     &&
 					obj instanceof Rectangulo	 &&
 					base == ((Rectangulo)obj).getBase() &&
 					altura == ((Rectangulo)obj).getAltura(); 
 	   }
 	   
//Método hashCoded 	  
 	   public int hashCoded(){
 			return (int) (super.hashCode() + base + altura);
 	   }
 	   
 		
//Método toString 	   
 	   public String toString(){
 	    	StringBuilder sb = new StringBuilder(super.toString());
 	    	sb.append(",base=");
 	    	sb.append(base);
 	    	return sb.toString();
 	   }	  	
	

}
