package ppal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import modelo.Inmueble;
import modelo.Piso;
import modelo.Terreno;
import modelo.comparadores.AscendentePrecio;

public class PruebaInmuebles {

	public static void main(String[] args) {
		
		List<Inmueble> lista = new ArrayList<>();
		
		Piso piso1 = new Piso();
		System.out.println("El piso creado es "+piso1);
		
		Piso piso2 = new Piso("sadasds", 80, 145000, 
				"Piso coqueto con 3 habitaciones", 
				1250, 3, false, false, 22);
		lista.add(piso2);
		System.out.println("El segundo piso es "+ piso2);
		System.out.println("IBI: "+piso2.calculaIBI());
		System.out.println("precio de venta: "+piso2.calculaPrecioVenta());
		
		Piso piso3 = new Piso("nhjhj", 65, 87000, 
				"Piso recofido con 2 habitaciones", 
				850, 2, true, false, 22);
		lista.add(piso3);
		System.out.println("El tercer piso es "+ piso3);
		System.out.println("IBI: "+piso3.calculaIBI());
		System.out.println("precio de venta: "+piso3.calculaPrecioVenta());
		
		Terreno t1 = new Terreno();
		System.out.println("El terreno es "+ t1);
		
		Terreno t2 = new Terreno("xzczxcxzc", 95, 200000, 
				"Chalet con pisicina", 1750, true, 2, 8500);
		System.out.println("El terreno es "+ t2);
		System.out.println("IBI: "+t2.calculaIBI());
		System.out.println("precio de venta: "+t2.calculaPrecioVenta());
		lista.add(t2);
		Terreno t3 = new Terreno("ooooogfdogf", 0, 150000, 
				"Huerto de sandías", 0, false, 9, 8500);
		System.out.println("El terreno es "+ t3);
		System.out.println("IBI: "+t3.calculaIBI());
		System.out.println("precio de venta: "+t3.calculaPrecioVenta());
		lista.add(t3);
		
		System.out.println("Lista de inmuebles " + lista);
		Collections.sort(lista);
		System.out.println("Lista de inmuebles " + lista);
		
		//ordenando por precioVentaç
		lista.sort(new AscendentePrecio());
		
	}
}
