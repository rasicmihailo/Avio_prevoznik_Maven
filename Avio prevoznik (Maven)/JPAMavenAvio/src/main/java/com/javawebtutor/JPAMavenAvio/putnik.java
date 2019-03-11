package com.javawebtutor.JPAMavenAvio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "putnik")
public class putnik {
	
	@Id
	@Column(name = "idputnik")
	private int idputnik;
	
	@Column(name = "ime")
	private String ime;
	
	@Column(name = "prezime")
	private String prezime;
	
	@Column(name = "br_pasosa")
	private String br_pasosa;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="firma_idfirma")
    private firma firma_idfirma;
	
	
	
	
	
	@OneToMany(mappedBy="putnik_idputnik")
    private List<putnik_has_let> putnik_has_lets=new ArrayList<putnik_has_let>();

	@OneToMany(mappedBy="putnik_idputnik")
    private List<racun> racuni=new ArrayList<racun>();
	
    @OneToMany(mappedBy="putnik_idputnik")
    private List<karta> karte=new ArrayList<karta>();
	
    
    
	public putnik() {
		
	}
	
	
	public putnik(int idputnik, String ime, String prezime, String br_pasosa, firma firma) {
		this.setIdputnik(idputnik);
		this.setIme(ime);
		this.setPrezime(prezime);
		this.setBr_pasosa(br_pasosa);
		this.setFirma_idfirma(firma);
	}

	public putnik(int idputnik, String ime, String prezime, String br_pasosa, int idfirma) {
		this.setIdputnik(idputnik);
		this.setIme(ime);
		this.setPrezime(prezime);
		this.setBr_pasosa(br_pasosa);
		this.firma_idfirma.setIdfirma(idfirma);
	}
	
	public int getIdputnik() {
		return idputnik;
	}


	public void setIdputnik(int idputnik) {
		this.idputnik = idputnik;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}


	public String getBr_pasosa() {
		return br_pasosa;
	}


	public void setBr_pasosa(String br_pasosa) {
		this.br_pasosa = br_pasosa;
	}
	
	public firma getFirma_idfirma() {
		return firma_idfirma;
	}

	public void setFirma_idfirma(firma firma_idfirma) {
		this.firma_idfirma = firma_idfirma;
	}


	@Override
	public String toString() {
		return "putnik [idputnik=" + idputnik + ", ime=" + ime + ", prezime=" + prezime + ", br_pasosa=" + br_pasosa + "]";
	}
	
	
	
}



