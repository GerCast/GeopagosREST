package com.geopagos.ws.rest.model;

public class Circulo extends Figura {


	public Circulo(Integer radio) {
		setRadio(radio);
		setTipoFigura(tipoFigura.CIRCULO);
	}
	
	public Circulo() {
		setRadio(0);
		setTipoFigura(tipoFigura.CIRCULO);
	}

	@Override
	public Double getSuperficie() {
		return Math.pow( super.getRadio(), 2) * 3.1421;
	}
	@Override
	public Integer getBase() {
		return null;
	}

	@Override
	public Integer getAltura() {
		return null;
	}

	@Override
	public Integer getDiametro() {
		return super.getRadio() * 2;
	}
	@Override
	public Integer getRadio() {
		return super.getRadio();
	}
	
	public String dataToString()
	{
		String data = super.dataToString() ;
		data += "Radio: " + getRadio() + System.lineSeparator() ;
		data += "Diametro: " + getDiametro() + System.lineSeparator() ;
		data += "Superficie: " + getSuperficie() + System.lineSeparator() ;
		return data;
	}
}
