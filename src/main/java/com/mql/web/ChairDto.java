package com.mql.web;

import java.util.List;

import com.mql.entities.Article;
import com.mql.entities.Chair;

public class ChairDto {
	private Long idChair;
	private Long idArticle;
	private String name;
	private Long note;
	
	private List<Article> articles;
	

	
	public ChairDto() {
		super();
	}
	public ChairDto(Chair chair) {
		this.idChair = chair.getIdChair();
		this.name= chair.getName();	
		this.articles=chair.getArticles();
		System.out.println(articles);
	}
	public long getIdChair() {
		return idChair;
	}
	public void setIdChair(long idChair) {
		this.idChair = idChair;
	}
	public Long getIdArticle() {
		if(idArticle!=null){
			return idArticle;
		}
		return null;
	}
	public void setIdArticle(long idArticle) {
		this.idArticle = idArticle;
	}
	public Long getNote() {
		if(note!=null){
			return note;
		}
		return null;
		
	}
	public void setNote(long note) {
		this.note = note;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	

}
