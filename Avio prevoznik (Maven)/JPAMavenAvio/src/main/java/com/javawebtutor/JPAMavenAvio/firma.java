package com.javawebtutor.JPAMavenAvio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "firma")
public class firma {

	@Id
	@Column(name = "idfirma")
	private int idfirma;
	
	@Column(name = "naziv")
	private String naziv;
	
	@Column(name = "adresa")
	private String adresa;
	
	
	
	@OneToMany(mappedBy="firma_idfirma")
    private List<putnik> putnici=new ArrayList<putnik>();
    
    @OneToMany(mappedBy="firma_idfirma")
    private List<racun> racuni=new ArrayList<racun>();
    
    public firma() {
    	
    }
    
    public firma(int idfirma, String naziv, String adresa) {
    	this.setIdfirma(idfirma);
    	this.setNaziv(naziv);
    	this.setAdresa(adresa);
    }

	public int getIdfirma() {
		return idfirma;
	}

	public void setIdfirma(int idfirma) {
		this.idfirma = idfirma;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	@Override
	public String toString() {
		return "firma [idfirma=" + idfirma + ", naziv=" + naziv + ", adresa=" + adresa + "]";
	}
	
	
}
