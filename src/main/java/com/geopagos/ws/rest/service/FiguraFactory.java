package com.geopagos.ws.rest.service;

import com.geopagos.ws.rest.model.*;

public class FiguraFactory {
	
	public static Figura getFigura(Figura.tipoFigura tipoFigura)
	{
		if(tipoFigura.equals(Figura.tipoFigura.CIRCULO))
		{
			return new Circulo();
		}
		else if(tipoFigura.equals(Figura.tipoFigura.TRIANGULO))
		{
			return new Triangulo();
		}
		else if(tipoFigura.equals(Figura.tipoFigura.CUADRADO))
		{
			return new Cuadrado();
		}
		
		return null;
	}

}
