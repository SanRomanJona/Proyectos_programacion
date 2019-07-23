package CreacionDeObjeto;


public class Televisiones { 
	
	String marca;
	int altura,ancho;
	boolean sonido = false;
	short id_producto = 0;
	short id_pedida = 0;
	
	public void mostrardatos(){
		
		System.out.println("La marca es: "+marca);
		
		System.out.println("La altura es de :"+altura+" cm.");
		
		System.out.println("La altura es de :"+ancho+" cm.");
		
		System.out.println("El id de producto es: "+id_producto);
		
	}
}
	

