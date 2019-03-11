package com.javawebtutor.JPAMavenAvio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "racun")
public class racun {
	@Id
	@Column(name = "idracun")
	private int idracun;

	@Column(name = "novac")
	private int novac;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="putnik_idputnik")
    private putnik putnik_idputnik;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="firma_idfirma")
    private firma firma_idfirma;

	public racun() {
		
	}
	
	public racun(int idracun, int novac, putnik putnik, firma firma) {
		this.setIdracun(idracun);
		this.setNovac(novac);
		this.setPutnik_idputnik(putnik);
		this.setFirma_idfirma(firma);
	}
	
	public int getIdracun() {
		return idracun;
	}

	public void setIdracun(int idracun) {
		this.idracun = idracun;
	}

	public int getNovac() {
		return novac;
	}

	public void setNovac(int novac) {
		this.novac = novac;
	}

	public putnik getPutnik_idputnik() {
		return putnik_idputnik;
	}

	public void setPutnik_idputnik(putnik putnik_idputnik) {
		this.putnik_idputnik = putnik_idputnik;
	}

	public firma getFirma_idfirma() {
		return firma_idfirma;
	}

	public void setFirma_idfirma(firma firma_idfirma) {
		this.firma_idfirma = firma_idfirma;
	}

	@Override
	public String toString() {
		return "racun [idracun=" + idracun + ", novac=" + novac + "]";
	}
	
	
}
