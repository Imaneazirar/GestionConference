package com.mql.entities;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Chair {
	@Id
	@GeneratedValue
	private long idChair;
	private String name;
	private double Note;
	@OneToMany(mappedBy="chair",fetch=FetchType.LAZY)
	private List <Article>  articles;
	

	public long getIdChair() {
		return idChair;
	}
	public void setIdChair(long idChair) {
		this.idChair = idChair;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getNote() {
		return Note;
	}
	public void setNote(double note) {
		Note = note;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	public Chair(long idChair, String name, double note, List<Article> articles) {
		super();
		this.idChair = idChair;
		this.name = name;
		Note = note;
		this.articles = articles;
	}
	public Chair() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
