package fpdualeveris;

import constantes.Constantes;
import variables.Developer;

/** Clase principal contenedora del Main
 * 
 * @author Luis Rafael Arroyo Caballero
 * @version 1.0
 */

public class FPDual {
	
	/** Metodo principal (main)
	 * 
	 * @author Luis Rafael Arroyo Caballero
	 * @param args
	 */
	public static void main(String[] args) {
		variablesChallenge();
	}
	
	
	/** Metodo encargado de utilizar los distintos metodos de la clase Developer
	 * 
	 * @author Luis Rafael Arroyo Caballero
	 */
	private static void variablesChallenge() {
		
		// Generamos el StringBuilder 
		
		StringBuilder strResult = new StringBuilder();
		
		// Se instancian los nuevos empleados.
		
		Developer d1 = new Developer("Alejandro");
		Developer d2 = new Developer("Beatriz");
		Developer d3 = new Developer("Carlos");
		Developer d4 = new Developer("Daniela");
		
		// Se muestra el conteo de empleados. 
		
		strResult.append("La empresa de los programadores es: ");
		strResult.append(Developer.COMPANY);
		strResult.append(Constantes.LINE_BREAK);
		strResult.append(Constantes.LINE_BREAK);
		
		// Se muestran todos los numeros de empleado. 
		
		strResult.append("Estos son los id de todos los empleados:");
		strResult.append(Constantes.LINE_BREAK);
		strResult.append(d1.getName());
		strResult.append(Constantes.BLANK_SPACE);
		strResult.append(d1.getIdEmployee());
		strResult.append(Constantes.LINE_BREAK);
		strResult.append(d2.getName());
		strResult.append(Constantes.BLANK_SPACE);
		strResult.append(d2.getIdEmployee());
		strResult.append(Constantes.LINE_BREAK);
		strResult.append(d3.getName());
		strResult.append(Constantes.BLANK_SPACE);
		strResult.append(d3.getIdEmployee());
		strResult.append(Constantes.LINE_BREAK);
		strResult.append(d4.getName());
		strResult.append(Constantes.BLANK_SPACE);
		strResult.append(d4.getIdEmployee());
		strResult.append(Constantes.LINE_BREAK);
		strResult.append(Constantes.LINE_BREAK);
		
		// Descontamos dos dias vacacionales al segundo empleado. 
		
		d2.goHolidays(2);
		
		// Mostramos los dias de vacaciones de cada empleado.
		
		strResult.append("Estos son los dias de vacaciones restantes de cada empleado:");
		strResult.append(Constantes.LINE_BREAK);
		strResult.append(d1.getName());
		strResult.append(Constantes.BLANK_SPACE);
		strResult.append(d1.getCountHolidays());
		strResult.append(Constantes.LINE_BREAK);
		strResult.append(d2.getName());
		strResult.append(Constantes.BLANK_SPACE);
		strResult.append(d2.getCountHolidays());
		strResult.append(Constantes.LINE_BREAK);
		strResult.append(d3.getName());
		strResult.append(Constantes.BLANK_SPACE);
		strResult.append(d3.getCountHolidays());
		strResult.append(Constantes.LINE_BREAK);
		strResult.append(d4.getName());
		strResult.append(Constantes.BLANK_SPACE);
		strResult.append(d4.getCountHolidays());
		strResult.append(Constantes.LINE_BREAK);
		strResult.append(Constantes.LINE_BREAK);
		
		System.out.println(strResult);
		
	}

}
