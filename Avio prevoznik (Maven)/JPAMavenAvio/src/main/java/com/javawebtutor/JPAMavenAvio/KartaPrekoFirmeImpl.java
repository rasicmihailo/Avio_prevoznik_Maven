package com.javawebtutor.JPAMavenAvio;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


@Remote(KartaPrekoFirme.class)
@Stateless
public class KartaPrekoFirmeImpl implements KartaPrekoFirme {
	private EntityManager em;

	@Override
	public void dodajPutnika(putnik p) {
		EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("JPAMavenAvio");
		
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}

	@Override
	public void dodajKartu(karta k) {
		EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("JPAMavenAvio");
		
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(k);
		em.getTransaction().commit();
	}

	@Override
	public void dodajFirmu(firma f) {
		EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("JPAMavenAvio");
		
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
	}

	@Override
	public void dodajRacun(racun r) {
		EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("JPAMavenAvio");
		
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(r);
		em.getTransaction().commit();
	}

	@Override
	public List<let> listaLetova() {
		EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("JPAMavenAvio");
		
		em = emf.createEntityManager();
		
		List<let> lista = new ArrayList<let>();
		lista=em.createQuery("select l FROM let l").getResultList();
		return lista;
	}
	
	@Override
	public racun pribaviRacun(firma firma) {
		EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("JPAMavenAvio");
		
		em = emf.createEntityManager();
		
		
		racun rac=em.createQuery("select r FROM racun r WHERE r.firma_idfirma=:arg", racun.class).setParameter("arg", firma).getSingleResult();
		return rac;
	}

	@Override
	public firma pribaviFirmu(int id) {
		EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("JPAMavenAvio");
		
		em = emf.createEntityManager();
		
		
		firma fir=em.createQuery("select f FROM firma f WHERE f.idfirma=:arg", firma.class).setParameter("arg", id).getSingleResult();
		
		
		return fir;
	}

	@Override
	public void skiniNovacSaRacuna(racun racun, int novac) {
		EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("JPAMavenAvio");
		
		em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		
		em.createQuery("update racun r set r.novac=r.novac-:arg1 where r.idracun=:arg2").setParameter("arg1", novac).setParameter("arg2", racun.getIdracun()).executeUpdate();	
	
		em.getTransaction().commit();
	
	}
	
	
}
