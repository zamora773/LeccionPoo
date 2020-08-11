package com.ejerciciopoo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ranking {
	@Id
	@GeneratedValue
	private int id;
	private Integer ranking;

	@ManyToOne
	@JoinColumn(name="id",referencedColumnName="id")
	private Persona persona;

	@ManyToOne
	@JoinColumn(name="id",referencedColumnName="id")
	private Skill skill;

	public Ranking() {
	}
	

	public Ranking(Integer ranking) {
		super();
		this.ranking = ranking;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	
	
	
	

}
