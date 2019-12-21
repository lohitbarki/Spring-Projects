package com.web.core;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class BookAuthor 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long m_id;
	private String fName;
	private String lName;
	
	@ManyToMany(mappedBy = "m_authors")
	private Set<Book> books = new HashSet<>();
	
	
	public BookAuthor() {
	}

	public BookAuthor(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}

	public BookAuthor(String fName, String lName, Set<Book> books) {
		this.fName = fName;
		this.lName = lName;
		this.books = books;
	}
	
	public Long getId() {
		return m_id;
	}

	public void setId(Long m_id) {
		this.m_id = m_id;
	}
	public String getFname() {
		return fName;
	}

	public void setLname(String fName) {
		this.fName = fName;
	}

	public String getLname() {
		return lName;
	}

	public void setFname(String lName) {
		this.lName = lName;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
}
