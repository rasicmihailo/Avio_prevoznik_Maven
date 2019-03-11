package com.javawebtutor.JPAMavenAvio;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class racunTest {
	private static EntityManager em; 
	  
    public static void main(String[] args) { 
	  try {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAMavenAvio"); 
	  
	        em = emf.createEntityManager(); 
	  }catch(Exception ec) {
		  System.out.println(ec.getMessage());
	  }
  		
  		//createRacunPutnik(1, 10000, new putnik(1, null, null, null, null));
  		//createRacunFirma(2, 30000, new firma(2, null, null));
	  	//createRacunFirma(3, 100000, new firma(1, null, null));
	  	getRacun(3);
    } 


	private static void createRacunPutnik(int idracun, int novac, putnik putnik) { 
        em.getTransaction().begin(); 
        racun emp = new racun(idracun, novac, putnik, null); 
        em.persist(emp); 
        em.getTransaction().commit();

    }
    private static void createRacunFirma(int idracun, int novac, firma firma) { 
        em.getTransaction().begin(); 
        racun emp = new racun(idracun, novac, null, firma); 
        em.persist(emp); 
        em.getTransaction().commit();

    }  
    private static void getRacun(int idracun) {
		racun r = em.find(racun.class, idracun);
		System.out.println(r);
		
	}
}
