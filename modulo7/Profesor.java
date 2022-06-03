package modulo7;

//Con el extends indicas que es subclase de Persona
public class Profesor extends Persona {

	  private String iosfa;
	  
//Constructor con par�metro	 
 	  public Profesor (String nombre, String apellido){
 		 super(nombre,apellido);
		 this.iosfa = "";
 	  }

//Constructor sin par�metro	 
 	  public Profesor (){
		 this.iosfa = "";
 	  }
 	  
// Aqu� empezamos a declarar gets y sets (m�todos espec�ficos subclase)
 	  public String getIosfa(){
 	    return this.iosfa;
 	  }
 	 
 	  public void setIosfa(String iosfa){
 	    this.iosfa = iosfa;
 	  }
 	  
//M�todo equals 	  
 	  public boolean equals(Object obj){		
 			return super.equals(obj) 	     &&
 					obj instanceof Profesor	 &&
 					iosfa == ((Profesor)obj).getIosfa();
 	   }
 	   
//M�todo hashCoded 	  
 	   public String hashCoded(){
 			return super.hashCode() + iosfa;
 	   }
 		
//M�todo toString 	   
 	   public String toString(){
 	    	StringBuilder sb = new StringBuilder(super.toString());
 	    	sb.append(",iosfa=");
 	    	sb.append(iosfa);
 	    	return sb.toString();
 	   }	   	  
}	  


