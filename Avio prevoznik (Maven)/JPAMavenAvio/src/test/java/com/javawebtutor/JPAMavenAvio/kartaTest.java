package com.javawebtutor.JPAMavenAvio;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class kartaTest {
	private static EntityManager em; 
	  
    public static void main(String[] args) { 
	  try {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAMavenAvio"); 
	  
	        em = emf.createEntityManager(); 
	  }catch(Exception ec) {
		  System.out.println(ec.getMessage());
	  }
  		
//  		createKarta(1, 300, new putnik(2, null, null, null, null), new let(1, null, null, null));
//	  createKarta(2, 320, new putnik(1, null, null, null, null), new let(2, null, null, null));
	//  createKarta(3, 250, new putnik(1, null, null, null, null), new let(1, null, null, null));
	  
	  getKarta(2);
    } 
  
    private static void createKarta(int idkarta, int cena, putnik putnik_idputnik, let let_idlet) { 
        em.getTransaction().begin(); 
        karta emp = new karta(idkarta, cena, putnik_idputnik, let_idlet); 
        em.persist(emp); 
        em.getTransaction().commit();

    }
    
    public static void getKarta(int idkarta) {
    	karta k = em.find(karta.class, idkarta);
    	System.out.println(k);
    }
}
