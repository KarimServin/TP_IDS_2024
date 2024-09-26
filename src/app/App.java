package app;

import resources.*;


public class App {

	public static void main(String[] args) {
		
		
		System.out.println("Bienvenido al sistema desarrollado para el TP de Ingeneria y Calidad de Software");
	

Alumno arreglo[];
		
		arreglo = new Alumno[4];
		Grupo grupo = new Grupo(43);
		
		arreglo[0] = new Alumno("Juan","Grenon",25429);
		arreglo[1] = new Alumno("Karim","Servin",25430);
		arreglo[2] = new Alumno("Tomas","Alzugaray",25431);
		arreglo[3] = new Alumno("Santino","Vazzano",25432);
		
		System.out.println("\n\n Desarrollado por: \n");
		
		for (int i = 0; i < 4; i++) {
		    System.out.println(String.format("%s %s %d", 
		        arreglo[i].getNombre(), 
		        arreglo[i].getApellido(), 
		        arreglo[i].getNumeroLegajo()));
		}
		System.out.println("Somos el grupo nº " + grupo.getNumero());
		
	}
	
	
	
	
	
	

	
}
 