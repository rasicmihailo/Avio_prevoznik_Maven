package com.javawebtutor.JPAMavenAvio;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class putnik_has_letTest {
	private static EntityManager em; 
	  
    public static void main(String[] args) { 
	  try {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAMavenAvio"); 
	  
	        em = emf.createEntityManager(); 
	  }catch(Exception ec) {
		  System.out.println(ec.getMessage());
	  }
	  
	  //createPutnikHasLet(1, new putnik(2, null, null, null, null), new let(1, null, null, null));
	  
	  getPutnikHasLet(1);
    } 


	private static void createPutnikHasLet(int id, putnik putnik_idputnik, let let_idlet) { 
        em.getTransaction().begin(); 
        putnik_has_let emp = new putnik_has_let(id, putnik_idputnik, let_idlet); 
        em.persist(emp); 
        em.getTransaction().commit();

    }  
    private static void getPutnikHasLet(int id) {
		putnik_has_let phl=em.find(putnik_has_let.class, id);
		System.out.println(phl);
		
	}
    
    
}
