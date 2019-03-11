package com.javawebtutor.JPAMavenAvio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "let")
public class let {
	@Id
	@Column(name = "idlet")
	private int idlet;
	
	@Column(name = "od_lokacija")
	private String od_lokacija;
	
	@Column(name = "do_lokacija")
	private String do_lokacija;
	
	@Column(name = "vreme")
	private String vreme;

	
	
	@OneToMany(mappedBy="let_idlet")
    private List<putnik_has_let> putnik_has_lets=new ArrayList<putnik_has_let>();
	
	public let() {
		
	}
	
	
	public let(int idlet, String od_lokacija, String do_lokacija, String vreme) {
		this.setIdlet(idlet);
		this.setOd_lokacija(od_lokacija);
		this.setDo_lokacija(do_lokacija);
		this.setVreme(vreme);
	}

	public int getIdlet() {
		return idlet;
	}

	public void setIdlet(int idlet) {
		this.idlet = idlet;
	}

	public String getOd_lokacija() {
		return od_lokacija;
	}

	public void setOd_lokacija(String od_lokacija) {
		this.od_lokacija = od_lokacija;
	}

	public String getDo_lokacija() {
		return do_lokacija;
	}

	public void setDo_lokacija(String do_lokacija) {
		this.do_lokacija = do_lokacija;
	}

	public String getVreme() {
		return vreme;
	}

	public void setVreme(String vreme) {
		this.vreme = vreme;
	}


	@Override
	public String toString() {
		return "let [idlet=" + idlet + ", od_lokacija=" + od_lokacija + ", do_lokacija=" + do_lokacija + ", vreme="
				+ vreme + "]";
	}
	
	
}
