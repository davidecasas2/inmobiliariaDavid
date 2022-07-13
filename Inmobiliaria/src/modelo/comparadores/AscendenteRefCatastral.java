package modelo.comparadores;

import java.util.Comparator;

import modelo.Inmueble;

public class AscendenteRefCatastral implements Comparator<Inmueble>  {

	@Override
	public int compare(Inmueble o1, Inmueble o2) {
		return o1.getRefCatastral().compareTo(o2.getRefCatastral());
	}

}
