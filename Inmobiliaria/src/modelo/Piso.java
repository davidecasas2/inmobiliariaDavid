package modelo;

public class Piso extends Inmueble {

	protected int numHab;
	protected boolean vpo;
	protected boolean atico;
	protected int antiguedad;
	
	
	
	
	public Piso() {
		super();
		this.numHab=0;
		this.vpo=false;
	}
	
	

	public Piso(String refCatastral, double superficie, double valorCatastral, String descripcion, double precioM2,
			int numHab, boolean vpo, boolean atico, int antiguedad) {
		super(refCatastral, superficie, valorCatastral, descripcion, precioM2);
		this.numHab = numHab;
		this.vpo = vpo;
		this.atico = atico;
		this.antiguedad = antiguedad;
	}

	public Piso(Piso p) {
		super(p);
		this.numHab = p.numHab;
		this.vpo = p.vpo;
		this.atico = p.atico;
		this.antiguedad = p.antiguedad;
	}

	


	@Override
	public String toString() {
		return "Piso [refCatastral=" + refCatastral + ", superficie=" + superficie + ", valorCatastral="
				+ valorCatastral + ", descripcion=" + descripcion + ", precioM2=" + precioM2 + ", numHab=" + numHab
				+ ", vpo=" + vpo + ", atico=" + atico + ", antiguedad=" + antiguedad + "]";
	}


	

	public int getNumHab() {
		return numHab;
	}



	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}



	public boolean isVpo() {
		return vpo;
	}



	public void setVpo(boolean vpo) {
		this.vpo = vpo;
	}



	public boolean isAtico() {
		return atico;
	}



	public void setAtico(boolean atico) {
		this.atico = atico;
	}



	public int getAntiguedad() {
		return antiguedad;
	}



	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}



	@Override
	public double calculaIBI() {
		double ibi = this.valorCatastral*Inmueble.COEFURBANO;
		if (isVpo()) {
			ibi = ibi/2;
		}
		return ibi;
	}

	@Override
	public double calculaPrecioVenta() {
		double precioVenta = this.precioM2*this.superficie;
		if (isAtico()) {
			precioVenta= precioVenta + precioVenta*0.06;
		}  
		if (isVpo() && this.antiguedad<25) {
			precioVenta=0;
		}
		return precioVenta;
	}


}
