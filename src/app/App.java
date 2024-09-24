package app;

import resources.*;


public class App {

	public static void main(String[] args) {
		
		
		System.out.println("Bienvenido al sistema desarrollado para el TP de Ingeneria y Calidad de Software");
	

Alumno arreglo[];
		
		arreglo = new Alumno[3];
		
		arreglo[0] = new Alumno("Julian","Serrano",25429);
		arreglo[1] = new Alumno("Julian","Serrana",25430);
		arreglo[2] = new Alumno("Julian","Serra",25431);
		
		System.out.println("\n\n Desarrollado por: \n");
		
		for (int i = 0; i < 3; i++) {
		    System.out.println(String.format("%s %s %d", 
		        arreglo[i].getNombre(), 
		        arreglo[i].getApellido(), 
		        arreglo[i].getNumeroLegajo()));
		}
		
	}
	
	
	
	
	
	

	
}
 