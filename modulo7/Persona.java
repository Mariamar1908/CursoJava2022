package modulo7;


public abstract class Persona {

	 private String nombre;
	 private String apellidos;
	 
//Constructor con parámetros	 
	 public Persona (String n, String a){
	     this.nombre = n;
         this.apellidos = a; 
	 }

//Constructor sin parámetros
	 public Persona (){
	     this.nombre = "";  
	     this.apellidos = ""; 
    }
	 
// Aquí empezamos a declarar gets y sets (métodos)
	 
	  public String getNombre( ){
	    return this.nombre;
	  }
	 
	  public void setNombre(String nombre){
	    this.nombre = nombre;
	  }
	 
	  public String getApellidos( ){
	    return this.apellidos;
	  }
	 
	  public void setApellidos(String apellidos){
	    this.apellidos = apellidos;
	  }
	  
//Método equals 	  
		public boolean equals(Object obj){
			return super.equals(obj) 	     &&
 					obj instanceof Persona	 &&
 					nombre == ((Persona)obj).getNombre() &&
					apellidos == ((Persona)obj).getApellidos();

		}
		
//Método hashcode		
		public int hashCode(){
			return String.(this.hashCode() + nombre + apellidos);
		}
		
//Método toString		
		public String  toString(){
			StringBuilder sb = new StringBuilder("nombre");
			sb.append(nombre);
			sb.append(",nombre=");
			sb.append(nombre);	
			
			return sb.toString();
		}	  
}
