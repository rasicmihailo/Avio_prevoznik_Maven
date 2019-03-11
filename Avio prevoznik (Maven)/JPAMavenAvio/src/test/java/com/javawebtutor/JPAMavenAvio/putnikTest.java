package com.javawebtutor.JPAMavenAvio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class putnikTest {
	private static EntityManager em; 
	  
    public static void main(String[] args) { 
  try {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAMavenAvio"); 
  
        em = emf.createEntityManager(); 
  }catch(Exception ec) {
	  System.out.println(ec.getMessage());
  }
  
  	//	createPutnik(1, "Jovan", "Petrovic", "83155512", null);
    //  createPutnik(2, "Milan", "Petrovic", "83159992", null); 
  	//	createPutnik(3, "Stanko", "Stosic", "89745692", new firma(1, "ARTeam", "Omladinska 8, Vranje")); 
  	//	createPutnik(4, "Stefan", "Stosic", "89777792", new firma(2, "Apple", "Omladinska 10, Vranje")); 
  		getPutnik(2);
  
    } 
  


	private static void createPutnik(int idputnik, String ime, String prezime, String br_pasosa, firma firma) { 
        em.getTransaction().begin(); 
        putnik emp = new putnik(idputnik, ime, prezime, br_pasosa, firma); 
        em.persist(emp); 
        em.getTransaction().commit();

    }
	
    private static void getPutnik(int idputnik) {
    	putnik p = em.find(putnik.class, idputnik);
    	System.out.println(p);
		
	}
}
