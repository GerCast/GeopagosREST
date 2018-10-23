package com.geopagos.ws.rest.persistence;
import javax.persistence.*;

@Entity(name="figura")
public class figuraDAO {
	@Id
	@Column(name="id")
	@GeneratedValue
	private Integer id;
	
	@Column(name="base")
	private Integer base;
	
	@Column(name="altura")
	private Integer altura;
	
	@Column(name="radio")
	private Integer radio;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="superficie")
	private double superficie;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBase() {
		return base;
	}

	public void setBase(Integer base) {
		this.base = base;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Integer getRadio() {
		return radio;
	}

	public void setRadio(Integer radio) {
		this.radio = radio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
}
