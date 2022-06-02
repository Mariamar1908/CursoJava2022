package util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	public static int getAnio(Date Fecha){
//Crea el calendar con la fecha de hoy
		Calendar cal = Calendar.getInstance();
//Establecemos la hora del calendario		
		cal.setTime(Fecha);
//Obtenemos el año y lo retornamos
//      int anio = cal.get(Calendar.YEAR);   return (anio);
        return cal.get(Calendar.YEAR);
	}
	
	public static int getMes(Date Fecha){
//Crea el calendar con la fecha de hoy
		Calendar cal = Calendar.getInstance();
//Establecemos la hora del calendario			
		cal.setTime(Fecha);
//Obtenemos el mes y lo retornamos	
//		int mes = cal.get(Calendar.MONTH) + 1;  return (mes);
		return cal.get(Calendar.MONTH)+1;
	}
	
	public static int getDia(Date Fecha){
//Crea el calendar con la fecha de hoy
		Calendar cal = Calendar.getInstance();
//Establecemos la hora del calendario		
		cal.setTime(Fecha);
//Obtenemos el día y lo retornamos		
//		int dia = cal.get(Calendar.DAY_OF_MONTH);  return (dia);		
		return cal.get(Calendar.DAY_OF_MONTH);
	}
	
	public static int getDiaDeSemana(Date Fecha){
//Crea el calendar con la fecha de hoy
		Calendar cal = Calendar.getInstance();
//Establecemos la hora del calendario		
		cal.setTime(Fecha);
//Obtenemos día de la semana (1,2,3,4,....)
//      int diasemana = cal.get(Calendar.DAY_OF_WEEK); return(diasemana);		
		return cal.get(Calendar.DAY_OF_WEEK);
}	
	
	public static boolean isFinDeSemana(Date Fecha){
//Crea el calendar con la fecha de hoy
		Calendar cal = Calendar.getInstance();
//Establecemos la hora del calendario		
		cal.setTime(Fecha);
//Miramos si el día es sábado o domingo, y retornamos true o false al fin de semana		
		if ((cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) ||
	        (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY))	{
		   return (true);
		}else {
			return (false);
		}
	}
	
	public static boolean isDiaDeSemana(Date Fecha){
//Crea el calendar con la fecha de hoy
		Calendar cal = Calendar.getInstance();
//Establecemos la hora del calendario		
		cal.setTime(Fecha);
//Miramos si el día no es sábado ni domingo, y retornamos true o false si es día de cada día
		if ((cal.get(Calendar.DAY_OF_WEEK)!= Calendar.SATURDAY) &
			(cal.get(Calendar.DAY_OF_WEEK)!= Calendar.SUNDAY)) {
			return (true);
		}else {
			return (false);
		}
	}	
}

