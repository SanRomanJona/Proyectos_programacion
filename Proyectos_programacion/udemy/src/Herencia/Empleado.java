package Herencia;

public class Empleado extends Persona {
	
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleados;
	
	
	public Empleado (String nombre, double sueldo) { // Desfinicion de la clase Hija o Subclase
		
		super(nombre); // Super debe ser la primera linea
		this.sueldo = sueldo;
		this.idEmpleado = ++contadorEmpleados;
	}

	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	
	public double getDueldo() {
		return sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
		@Override
		public String toString() {
	/*Primero mandamos a llamar el metodo toString de la clase Persona
	para que podamos observar los valores de la clase hija*/
	return super.toString() + "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
		}
}
