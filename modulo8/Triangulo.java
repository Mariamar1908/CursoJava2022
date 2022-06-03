package modulo8;

//Con el extends indicas que es subclase de Figura
public class Triangulo extends Figura {
    float lado1;
    float lado2;
    float lado3;

//Constructor con parámetros
	public Triangulo(float l1,float l2,float l3){
		this.lado1 = l1;
		this.lado2 = l2;
		this.lado3 = l3;
	}

//Constructor sin parámetros		
	public Triangulo(){
		this.lado1 = 0.00f;
		this.lado2 = 0.00f;
		this.lado3 = 0.00f;
	}

//Aquí empezamos a declarar gets y sets (métodos)
	public float getLado1(){
		return this.lado1;
	}		
	
	public void setLado1(float lado1){
		this.lado1 = lado1;
	}
	public float getLado2(){
		return this.lado2;
	}		
	
	public void setLado2(float lado2){
		this.lado2 = lado2;
	}
	
	public float getLado3(){
		return this.lado3;
	}		
	
	public void setLado3(float lado3){
		this.lado3 = lado3;
	}
	
//Calcular Superficie Triangulo		
	public double CalcSupTriangulo(){
		double area;
		area = (lado1 * lado2)/2;
		return area;
	}
	
//Calcular Perímetro Triangulo		
	public double calcPerimTriangulo(){
		double perimetro;
		perimetro = lado1 + lado2 + lado3;
		return perimetro;
	}
	
//Método equals 	  
 	  public boolean equals(Object obj){		
 			return super.equals(obj) 	     &&
 					obj instanceof Triangulo	 &&
 					lado1 == ((Triangulo)obj).getLado1() &&
 					lado2 == ((Triangulo)obj).getLado2() &&
 					lado3 == ((Triangulo)obj).getLado3(); 
 	   }
 	   
//Método hashCoded 	  
 	   public int hashCoded(){
 			return (int) (super.hashCode() + lado1 + lado2 + lado3);
 	   }
 	   
 		
//Método toString 	   
 	   public String toString(){
 	    	StringBuilder sb = new StringBuilder(super.toString());
 	    	sb.append(",lado1=");
 	    	sb.append(lado1);
 	    	return sb.toString();
 	   }	  	
	
}
