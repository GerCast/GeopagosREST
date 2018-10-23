package com.geopagos.ws.rest.service;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.geopagos.ws.rest.model.Figura;
import com.geopagos.ws.rest.persistence.figuraDAO;



@Path("/GeopagosTest")
public class ServiceFigura {
	
	@POST
	@Path("/saludo")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON}) 
	public String saludo(String nombre)
	{
		if("German".equals(nombre))
		{
			return "Hola " + nombre + " ACCESO CONCEDIDO!";
		}
		return "Hola " + nombre + " ACCESO DENEGADO!";
	}
	
	@POST
	@Path("/guardarFigura")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON}) 
	public Figura saludo(Figura figura)
	{
		figuraDAO fDAO = new figuraDAO();
		
		fDAO.setBase(figura.getBase());
		fDAO.setAltura(figura.getAltura());
		fDAO.setRadio(figura.getRadio());
		fDAO.setTipo(figura.getTipoFigura());
		fDAO.setSuperficie(figura.getSuperficie());
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("gpFiguras");
		EntityManager entityManager = factory.createEntityManager();
		
		entityManager.persist(fDAO);
		
		entityManager.getTransaction().commit();
		System.out.println("SAVE -> " + figura.toString());
		entityManager.close();
		factory.close();
		return figura;
	}
	
	@POST
	@Path("/getFiguras")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON}) 
	public List<figuraDAO> getAllFiguras()
	{
		figuraDAO fDAO = new figuraDAO();

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("gpFiguras");
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		
			
		Query q = entityManager.createQuery("SELECT * FROM figura;");
		List<figuraDAO> figuraList = q.getResultList();
		
		for(figuraDAO f: figuraList )
		{
			System.out.println("-> " + f.toString());
		}
		
		entityManager.close();
		factory.close();

		return figuraList;
	}
	
}
