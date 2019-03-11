package com.javawebtutor.JPAMavenAvio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "putnik_has_let")
public class putnik_has_let {
	@Id
	@Column(name = "id")
	private int id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "putnik_idputnik")
	private putnik putnik_idputnik;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "let_idlet")
	private let let_idlet;

	public putnik_has_let() {
		
	}
	
	public putnik_has_let(int id, putnik putnik_idputnik, let let_idlet) {
		this.setId(id);
		this.setPutnik_idputnik(putnik_idputnik);
		this.setLet_idlet(let_idlet);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "putnik_has_let [id=" + id + ", putnik_idputnik=" + putnik_idputnik.getIdputnik() + ", let_idlet=" + let_idlet.getIdlet() + "]";
	}
	
	
}
