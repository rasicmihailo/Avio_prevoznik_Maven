package com.javawebtutor.JPAMavenAvio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "karta")
public class karta {
	@Id
	@Column(name = "idkarta")
	private int idkarta;
	
	@Column(name = "cena")
	private int cena;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="putnik_idputnik")
    private putnik putnik_idputnik;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="let_idlet")
    private let let_idlet;

	public karta() {
		
	}
	
	public karta(int idkarta, int cena, putnik putnik_idputnik, let let_idlet) {
		this.setIdkarta(idkarta);
		this.setCena(cena);
		this.setPutnik_idputnik(putnik_idputnik);
		this.setLet_idlet(let_idlet);
	}

	public int getIdkarta() {
		return idkarta;
	}

	public void setIdkarta(int idkarta) {
		this.idkarta = idkarta;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public putnik getPutnik_idputnik() {
		return putnik_idputnik;
	}

	public void setPutnik_idputnik(putnik putnik_idputnik) {
		this.putnik_idputnik = putnik_idputnik;
	}

	public let getLet_idlet() {
		return let_idlet;
	}

	public void setLet_idlet(let let_idlet) {
		this.let_idlet = let_idlet;
	}

	@Override
	public String toString() {
		return "karta [idkarta=" + idkarta + ", cena=" + cena + ", putnik_idputnik=" + putnik_idputnik.getIdputnik() + ", let_idlet="
				+ let_idlet.getIdlet() + "]";
	}
	
	
}
