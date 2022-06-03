package modulo7;

//Con el extends indicas que es subclase de Persona
public class Profesor extends Persona {

	  private String iosfa;
	  
//Constructor con parámetro	 
 	  public Profesor (String nombre, String apellido){
 		 super(nombre,apellido);
		 this.iosfa = "";
 	  }

//Constructor sin parámetro	 
 	  public Profesor (){
		 this.iosfa = "";
 	  }
 	  
// Aquí empezamos a declarar gets y sets (métodos específicos subclase)
 	  public String getIosfa(){
 	    return this.iosfa;
 	  }
 	 
 	  public void setIosfa(String iosfa){
 	    this.iosfa = iosfa;
 	  }
 	  
//Método equals 	  
 	  public boolean equals(Object obj){		
 			return super.equals(obj) 	     &&
 					obj instanceof Profesor	 &&
 					iosfa == ((Profesor)obj).getIosfa();
 	   }
 	   
//Método hashCoded 	  
 	   public String hashCoded(){
 			return super.hashCode() + iosfa;
 	   }
 		
//Método toString 	   
 	   public String toString(){
 	    	StringBuilder sb = new StringBuilder(super.toString());
 	    	sb.append(",iosfa=");
 	    	sb.append(iosfa);
 	    	return sb.toString();
 	   }	   	  
}	  


