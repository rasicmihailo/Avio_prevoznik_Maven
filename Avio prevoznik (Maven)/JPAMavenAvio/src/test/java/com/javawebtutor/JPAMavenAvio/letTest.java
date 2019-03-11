package com.javawebtutor.JPAMavenAvio;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class letTest {
	private static EntityManager em; 
	  
    public static void main(String[] args) { 
	  try {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAMavenAvio"); 
	  
	        em = emf.createEntityManager(); 
	  }catch(Exception ec) {
		  System.out.println(ec.getMessage());
	  }
  		
  		//createLet(1, "Vranje", "Nis", "18.08.2018. 15:45");
	  //createLet(2, "London", "Pariz", "04.07.2018. 10:45");
	  //createLet(3, "Moskva", "Pariz", "01.06.2018. 17:45");
	  //createLet(4, "Amsterdam", "Beograd", "14.07.2018. 10:00");
	  getLet(4);
    } 
  
    private static void createLet(int idlet, String od_lokacija, String do_lokacija, String vreme) { 
        em.getTransaction().begin(); 
        let emp = new let(idlet, od_lokacija, do_lokacija, vreme); 
        em.persist(emp); 
        em.getTransaction().commit();

    }
    
    public static void getLet(int idlet) {
    	let l = em.find(let.class, idlet);
    	System.out.println(l);
    }
}
