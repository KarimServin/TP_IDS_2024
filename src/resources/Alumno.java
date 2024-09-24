
package resources;

public class Alumno extends Persona {

	private int numeroLegajo;
	
	public Alumno(String nombre,String apellido, int numeroLegajo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroLegajo = numeroLegajo;
	}

	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}
	
}
