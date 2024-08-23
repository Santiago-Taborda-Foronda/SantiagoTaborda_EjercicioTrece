package trece;
import java.util.HashMap;
import java.util.Iterator;

public class Aplicacion {
	public static void main(String[] args) {

		HashMap<Integer, String> mapaNombres=new HashMap<Integer, String>();
		
		mapaNombres.put(123, "Juan");
		mapaNombres.put(3, "Maria");
		mapaNombres.put(13, "pepe");
		mapaNombres.put(23, "David");
		mapaNombres.put(132, null);
		
		imprimirMapa(mapaNombres);
	}
	
		private static void imprimirMapa(HashMap<Integer, String> mapaNombres) {
			
			System.out.println(mapaNombres);
		Iterator<Integer> iterator=mapaNombres.keySet().iterator();
		
		while (iterator.hasNext()) {
			Integer llave = iterator.next();
			System.out.println(llave+ "-"+mapaNombres.get(llave));
			
		}
			
	}
	

}
