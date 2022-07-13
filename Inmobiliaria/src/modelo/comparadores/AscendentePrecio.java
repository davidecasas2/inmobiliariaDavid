package modelo.comparadores;

import java.util.Comparator;

import modelo.Inmueble;

public class AscendentePrecio implements Comparator<Inmueble>  {

	@Override
	public int compare(Inmueble o1, Inmueble o2) {
		return Double.compare(o1.calculaPrecioVenta(), o2.calculaPrecioVenta());
	}

}
