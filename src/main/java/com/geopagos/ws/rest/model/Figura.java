package com.geopagos.ws.rest.model;

public class Figura implements IFigura {
	private Integer base;
	private Integer altura;
	private Integer radio;
	private String tipo;
	public enum tipoFigura { CIRCULO, TRIANGULO, CUADRADO}
	
	public void setBase(Integer base) {
		this.base = base;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public void setRadio(Integer radio) {
		this.radio = radio;
	}
	
	
	public Double getSuperficie() {
		return (double)(this.base * this.altura);
	}

	
	public Integer getBase() {

		return this.base;
	}

	
	public Integer getAltura() {

		return  this.altura;
	}

	
	public Integer getDiametro() {

		return null;
	}
	
	
	public Integer getRadio() {

		return this.radio;
	}
	
	public String getTipoFigura()
	{
		return this.tipo;
	}
	
	public void setTipoFigura(tipoFigura tipo)
	{
		this.tipo = tipo.toString();
	}
	
	public String dataToString()
	{
		String data = "=== " + getTipoFigura() + " ===" + System.lineSeparator();
		return data;
	}

}
