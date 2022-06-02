package modulo6;

import java.util.Date;
import java.text.SimpleDateFormat;

import util.DateUtil;

public class Mod6_Ejercicio2 {

	public static void main(String[] args) {

	   String Valor_dia = "";
// A partir de la fecha de hoy nos indica Día, Mes, Año

       Date Fecha = new Date();
       
//Las 'EEEE' hace que nos devuelva el día (Monday, Tuesday, Wednesday,....)       
       SimpleDateFormat dma = new SimpleDateFormat ("EEEE-dd-MM-yyyy");
       
       System.out.println("Hoy es: " + Fecha);
       System.out.println("La fecha formateada es: " + dma.format(Fecha));
       
//Nos devuelve el día de la fecha 
       System.out.println("El día es: " + DateUtil.getDia(Fecha));
//Nos devuelve el mes de la fecha
       System.out.println("El mes es: " + DateUtil.getMes(Fecha));
//Nos devuelve el año de la fecha       
       System.out.println("El año es: " + DateUtil.getAnio(Fecha));
       
//Nos devuelve diaSemana 1,2,3,4,5,6,7    
       int diaSemana = DateUtil.getDiaDeSemana(Fecha);    

//Según el número de día, asigna lunes, martes,.....       
       if (diaSemana == 1) {
           Valor_dia = "Domingo";
       } else if (diaSemana == 2) {
           Valor_dia = "Lunes";
       } else if (diaSemana == 3) {
           Valor_dia = "Martes";
       } else if (diaSemana == 4) {
           Valor_dia = "Miercoles";
       } else if (diaSemana == 5) {
           Valor_dia = "Jueves";
       } else if (diaSemana == 6) {
           Valor_dia = "Viernes";
       } else if (diaSemana == 7) {
           Valor_dia = "Sabado";
       }
       
       System.out.println("El día de la semana es: " + Valor_dia);
       
//Miramos si el día es fin de semana o no       
       boolean esfindesemana = DateUtil.isFinDeSemana(Fecha);

       if (esfindesemana == true) {
    	  System.out.println("El día de la semana " + Valor_dia + " es fin de semana");
       }else {
     	  System.out.println("El día de la semana " + Valor_dia + " no es fin de semana");    
       }
       
//Miramos si el día es día de cada día o no       
       boolean esdiadesemana = DateUtil.isDiaDeSemana(Fecha);

       if (esdiadesemana == true) {
    	  System.out.println("El día de la semana " + Valor_dia + " es un día de cada día");
       }else {
     	  System.out.println("El día de la semana " + Valor_dia + " no es un día de cada día");    
       }
       
	}  
     
}
