package com.javawebtutor.JPAMavenClient;

import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ejb.*;
import org.jboss.*;
import org.junit.*;
import org.junit.runner.RunWith;



//import com.javawebtutor.JPAMavenAvio.*;

public class Client {

	public static void main(String[] args) throws Exception {
		
		invokeKartaPrekoFirmeImpl();	
		//invokeKartaKesomImpl();
		//invokeKartaPrekoNeta();
	}



	private static void invokeKartaPrekoFirmeImpl() throws NamingException {
//		final KartaPrekoFirme karta = lookupKartaPrekoFirme();		
//		
//		firma newFirma = karta.pribaviFirmu(1);
//		System.out.println(newFirma);
//		
//		
//		putnik newPutnik = new putnik(5, "Dragan", "Stajic", "33311478", new firma(1, null, null));
//		karta.dodajPutnika(newPutnik);
//		System.out.println(newPutnik);
//		
//		
//		List<let> listaLetova = karta.listaLetova();
//		
//		System.out.println("Letovi:");
//		
//		for (let l : listaLetova){
//			
//			System.out.println(l);
//		
//		}
//		
//		System.out.println("Odaberite broj leta:");
//		
//		Scanner scanIn = new Scanner(System.in);
//		int broj = scanIn.nextInt();
//		
//		racun rac = karta.pribaviRacun(newFirma);
//		
//		System.out.println(rac);
//		if (rac.getNovac()>500) {
//			karta newKarta = new karta(4, 700, new putnik(5, null, null, null, null), new let(broj, null, null, null));
//			karta.dodajKartu(newKarta);
//			System.out.println("Karta kupljena");
//		}
//		else {
//			System.out.println("Karta nije kupljena");
//		}

	}
	
//	private static KartaPrekoFirme lookupKartaPrekoFirme() throws NamingException {
//		final Hashtable<String, String> jndiProperties = new Hashtable<String, String>();
//		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
//		
//		final Context context = new InitialContext(jndiProperties);
//		
//		return (KartaPrekoFirme) context.lookup("ejb:/JPAMavenAvio-0.0.1-SNAPSHOT/KartaPrekoFirmeImpl!" + KartaPrekoFirme.class.getName());
//	}
	
	
	
	
	
	
	private static void invokeKartaPrekoNetaImpl() throws NamingException {
//		final KartaPrekoNeta karta = lookupKartaPrekoNeta();
		
	}
	
//	private static KartaKesom lookupKartaPrekoNeta() throws NamingException {
//	final Hashtable<String, String> jndiProperties = new Hashtable<String, String>();
//	jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
//	
//	final Context context = new InitialContext(jndiProperties);
//	
//	return (KartaPrekoNeta) context.lookup("ejb:/JPAMavenAvio-0.0.1-SNAPSHOT/KartaPrekoFirmeImpl!" + KartaPrekoNeta.class.getName());
//}
	
	
	
	
	private static void invokeKartaKesomImpl() throws NamingException {
//		final KartaKesom karta = lookupKartaKesom();
		
	}
	
//	private static KartaKesom lookupKartaKesom() throws NamingException {
//	final Hashtable<String, String> jndiProperties = new Hashtable<String, String>();
//	jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
//	
//	final Context context = new InitialContext(jndiProperties);
//	
//	return (KartaKesom) context.lookup("ejb:/JPAMavenAvio-0.0.1-SNAPSHOT/KartaPrekoFirmeImpl!" + KartaKesom.class.getName());
//}
}