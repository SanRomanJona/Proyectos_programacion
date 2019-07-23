package Herencia;

import java.util.Date;

public class Cliente extends Persona {
	
	private int idCliente;
	private java.util.Date fechaRegistro;
	private boolean vip;
	private static int contadorClientes;
	

	public Cliente(Date fechaRegistro, boolean vip) {
		this.idCliente = ++contadorClientes;
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
	}

	public int getidCliente() {
		return idCliente;
	}
	
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	
	public boolean isVip() {
		return vip;
	}
	
	public void serVip(boolean vip) {
		this.vip = vip;
	}
	
		@Override
		public String toString() {
			/*Primero mandamos a llamar el metodo toString de la clase Persona
			 para que podamos observar los calores de la clase Padre,
			 y despues imprimimos los calores de la clase hija*/
			return super.toString() + "Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
		}
}
