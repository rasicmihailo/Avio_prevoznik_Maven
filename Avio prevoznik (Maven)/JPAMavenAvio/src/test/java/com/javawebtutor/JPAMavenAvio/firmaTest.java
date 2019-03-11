package com.javawebtutor.JPAMavenAvio;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class firmaTest {
	private static EntityManager em; 
	  
    public static void main(String[] args) { 
  try {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAMavenAvio"); 
  
        em = emf.createEntityManager(); 
  }catch(Exception ec) {
	  System.out.println(ec.getMessage());
  }
        //createFirma(1, "ARTeam", "Omladinska 8, Vranje"); 
  		//createFirma(2, "Apple", "Omladinska 10, Vranje");
  		getFirma(1);

  
    } 
  
    private static void createFirma(int idfirma, String naziv, String adresa) { 
        em.getTransaction().begin(); 
        firma emp = new firma(idfirma, naziv, adresa); 
        em.persist(emp); 
        em.getTransaction().commit();

    }
    
    private static void getFirma(int idfirma) { 
    	firma f=em.find(firma.class, 1);
    	System.out.println(f);
    }
}
