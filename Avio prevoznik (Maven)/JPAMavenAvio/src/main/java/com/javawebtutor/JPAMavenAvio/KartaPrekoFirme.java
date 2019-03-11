package com.javawebtutor.JPAMavenAvio;

import javax.ejb.Remote;
import java.util.List;

public interface KartaPrekoFirme {
	public void dodajPutnika(putnik p);
	public void dodajKartu(karta k);
	public void dodajFirmu(firma f);
	public void dodajRacun(racun r);
	public firma pribaviFirmu(int id);
	public racun pribaviRacun(firma firma);
	public void skiniNovacSaRacuna(racun racun, int novac);
	public List<let> listaLetova();
}
