package modulo8;

public abstract  class Figura {
	
	 private String nombre;
	 private float maximaSuperficie;
	 
//Constructor con parámetros	 
	 public Figura (String n, float a){
        this.nombre = n;
        this.maximaSuperficie = a; 
	 }

//Constructor sin parámetros
	 public Figura (){
	     this.nombre = "";  
	     this.maximaSuperficie = 0f; 
   }
	 
//Aquí empezamos a declarar gets y sets (métodos)
	 
	  public String getNombre(){
	    return this.nombre;
	  }
	 
	  public void setNombre(String nombre){
	    this.nombre = nombre;
	  }
	 
	  public float getMaxSuperficie( ){
	    return this.maximaSuperficie;
	  }
	 
	  public void setMaxSuperficie(float maximaSuperficie){
	    this.maximaSuperficie = maximaSuperficie;
	  }
}
