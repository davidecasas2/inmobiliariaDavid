package modelo;

public class Terreno extends Inmueble {


	
	private boolean urbano;
	private double ha;
	private double precioHa;
		
	public Terreno() {
		super();
		this.urbano=true;
		this.ha=0;
		this.precioHa=0;
	}
	
	

	public Terreno(String refCatastral, double superficie, double valorCatastral, String descripcion, double precioM2,
			boolean urbano, double ha, double precioHa) {
		super(refCatastral, superficie, valorCatastral, descripcion, precioM2);
		this.urbano = urbano;
		this.ha = ha;
		this.precioHa = precioHa;
	}

	


	@Override
	public String toString() {
		return "Terreno [refCatastral=" + refCatastral + ", superficie=" + superficie + ", valorCatastral="
				+ valorCatastral + ", descripcion=" + descripcion + ", precioM2=" + precioM2 + ", urbano=" + urbano
				+ ", ha=" + ha + ", precioHa=" + precioHa + "]";
	}



	public boolean isUrbano() {
		return urbano;
	}



	public void setUrbano(boolean urbano) {
		this.urbano = urbano;
	}



	public double getHa() {
		return ha;
	}



	public void setHa(double ha) {
		this.ha = ha;
	}



	public double getPrecioHa() {
		return precioHa;
	}



	public void setPrecioHa(double precioHa) {
		this.precioHa = precioHa;
	}



	@Override
	public double calculaIBI() {
		double ibi=0;
		if(isUrbano()) {
			ibi= this.valorCatastral*Inmueble.COEFURBANO;
		} else {
			ibi= this.valorCatastral*Inmueble.COEFRUSTICO;
		}
		return ibi;
	}

	@Override
	public double calculaPrecioVenta() {
		double precio=0;
		if (this.urbano) {
			precio = this.superficie*this.precioM2;
		}
		
		precio = precio + this.ha*this.precioHa;
		return precio;
	}

}
