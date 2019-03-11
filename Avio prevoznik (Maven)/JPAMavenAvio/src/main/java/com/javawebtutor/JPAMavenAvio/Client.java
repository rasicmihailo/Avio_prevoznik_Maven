package com.javawebtutor.JPAMavenAvio;


import java.util.List;
import java.util.Scanner;

import javax.naming.NamingException;

public class Client {
public static void main(String[] args) throws Exception {
		
		invokeKartaPrekoFirmeImpl();	
		//invokeKartaKesomImpl();
		//invokeKartaPrekoNetaImpl();
	}



	private static void invokeKartaPrekoFirmeImpl() throws NamingException {
		final KartaPrekoFirme karta = new KartaPrekoFirmeImpl();
		
		
		firma newFirma = karta.pribaviFirmu(2);
		System.out.println(newFirma);
		
		
		putnik newPutnik = new putnik(18, "Predrag", "Mitic", "15446968", newFirma);
		karta.dodajPutnika(newPutnik);
		System.out.println(newPutnik);
		
		
		List<let> listaLetova = karta.listaLetova();
		
		System.out.println("Letovi:");
		
		for (let l : listaLetova){
			
			System.out.println(l);
		
		}
		
		System.out.println("Odaberite broj leta:");
		
		Scanner scanIn = new Scanner(System.in);
		int broj = scanIn.nextInt();
		
		racun rac = karta.pribaviRacun(newFirma);
		System.out.println(rac);
		
		if (rac.getNovac()>150) {
			karta newKarta = new karta(16, 150, newPutnik, new let(broj, null, null, null));
			karta.dodajKartu(newKarta);
			karta.skiniNovacSaRacuna(rac, 150);			
			System.out.println("Karta kupljena");
			System.out.println(newKarta);
		}
		else {
			System.out.println("Karta nije kupljena");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void invokeKartaPrekoNetaImpl() throws NamingException {
		final KartaPrekoNeta karta = new KartaPrekoNetaImpl();
		
	}
	
	
	private static void invokeKartaKesomImpl() throws NamingException {
		final KartaKesom karta = new KartaKesomImpl();
		
	}
}
