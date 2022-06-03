package modulo7;

//Con el extends indicas que es subclase de Persona
public class Alumno extends Persona {

	  private int legajo = 0;
	  
//Constructor con parámetro	 
 	  public Alumno (String nombre, String apellido){
 		 super(nombre,apellido);
		 this.legajo = 0;
 	  }

//Constructor sin parámetro	 
 	  public Alumno (){
		 this.legajo = 0;
 	  }

// Aquí empezamos a declarar gets y sets (métodos específicos subclase)
 	 
 	  public int getLegajo( ){
 	    return this.legajo;
 	  }
 	 
 	  public void setLegajo(int legajo){
 	    this.legajo = legajo;
 	  }
 	  
//Método equals 	  
 	  public boolean equals(Object obj){		
 			return super.equals(obj) 	     &&
 					obj instanceof Alumno	 &&
 					legajo == ((Alumno)obj).getLegajo();
 	   }
 	   
//Método hashCoded 	  
 	   public int hashCoded(){
 			return super.hashCode() + (int)legajo;
 	   }
 		
//Método toString 	   
 	   public String toString(){
 	    	StringBuilder sb = new StringBuilder(super.toString());
 	    	sb.append(",legajo=");
 	    	sb.append(legajo);
 	    	return sb.toString();
 	   }	  
}
