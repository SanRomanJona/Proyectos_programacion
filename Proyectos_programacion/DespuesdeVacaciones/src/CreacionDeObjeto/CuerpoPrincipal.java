package CreacionDeObjeto;

public class CuerpoPrincipal {
	

	public static void main(String[] args) {
		
		EquipoDeMusica objMusi = new EquipoDeMusica();
		
		objMusi.marca = "Sony";
		objMusi.sonido = true;
		objMusi.altura = 45;
		objMusi.ancho = 60;
		objMusi.id_pedida = 15;
		objMusi.id_producto = 10;
		
		objMusi.mostrardatos();
		
		System.out.println("");
		
		Televisiones objTele = new Televisiones();
		
		
		objTele.marca = "SAMSUNG";
		objTele.sonido = true;
		objTele.altura = 75;
		objTele.ancho = 120;
		objTele.id_producto = 15;
		
		objTele.mostrardatos();
		
		}

	}


