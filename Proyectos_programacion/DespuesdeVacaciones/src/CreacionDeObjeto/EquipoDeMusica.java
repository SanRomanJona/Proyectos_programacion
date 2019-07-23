package CreacionDeObjeto;

public class EquipoDeMusica {
	
	String marca;
	int altura;
	int ancho;
	boolean sonido = false;
	short id_producto = 0;
	short id_pedida = 0;
	
	public void mostrardatos() {
		
	System.out.println("La marca del Equipo de Musica es: "+marca);
		
		System.out.println("La altura es: "+altura+" cm.");
		
		System.out.println("El ancho es: "+ancho+" cm.");
		
		System.out.println("El id de producto es: "+id_producto);
		
	}

}
