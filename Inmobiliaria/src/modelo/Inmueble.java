package modelo;

import java.util.Objects;

public abstract class Inmueble 
      implements Comparable<Inmueble>{

	protected String refCatastral;
	protected double superficie;
	protected double valorCatastral;
	protected String descripcion;
	protected double precioM2;
	
	public static final double COEFURBANO=0.0085;
	public static final double COEFRUSTICO=0.0045;
	
	
	public Inmueble() {
		this.refCatastral ="";
		this.superficie=0;
		this.valorCatastral=0;
		this.descripcion="";
		this.precioM2=0;
	}


	public Inmueble(String refCatastral, double superficie, double valorCatastral, String descripcion,
			double precioM2) {
		super();
		this.refCatastral = refCatastral;
		this.setSuperficie(superficie);
		this.valorCatastral = valorCatastral;
		this.descripcion = descripcion;
		this.setPrecioM2(precioM2);
	}
	
	public Inmueble (Inmueble i) {
		this.refCatastral = i.refCatastral;
		this.setSuperficie(i.superficie);
		this.valorCatastral = i.valorCatastral;
		this.descripcion = i.descripcion;
		this.setPrecioM2(i.precioM2);
	}


	public String getRefCatastral() {
		return refCatastral;
	}


	public void setRefCatastral(String refCatastral) {
		this.refCatastral = refCatastral;
	}


	public double getSuperficie() {
		return superficie;
	}


	public void setSuperficie(double superficie) {
		if (superficie<0) {
			this.superficie=0;
		} else {
			this.superficie = superficie;
		}
	}


	public double getValorCatastral() {
		return valorCatastral;
	}


	public void setValorCatastral(double valorCatastral) {
		this.valorCatastral = valorCatastral;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecioM2() {
		return precioM2;
	}


	public void setPrecioM2(double precioM2) {
		if (precioM2<0) {
			this.precioM2=0;
		} else {
			this.precioM2 = precioM2;
		}
	}


	@Override
	public int hashCode() {
		return Objects.hash(refCatastral);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inmueble other = (Inmueble) obj;
		return Objects.equals(refCatastral, other.refCatastral);
	}


	@Override
	public String toString() {
		return "Inmueble [refCatastral=" + refCatastral + ", superficie=" + superficie + ", valorCatastral="
				+ valorCatastral + ", descripcion=" + descripcion + ", precioM2=" + precioM2 + "]";
	}
	
	public abstract double calculaIBI();
	
	public abstract double calculaPrecioVenta();


	@Override
	public int compareTo(Inmueble o) {
		if (this.superficie<o.superficie) {
			return -1;
		} else if(this.superficie==o.superficie) {
			return 0;
		} else {
			return 1;
		}
		
		//return Double.compare(this.superficie,o.superficie);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
