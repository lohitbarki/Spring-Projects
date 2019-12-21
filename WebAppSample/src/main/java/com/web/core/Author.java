package com.web.core;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long m_id;
	private String fName;
	private String lName;
	
	@ManyToMany(mappedBy = "m_authors")
	private Set<Book> books = new HashSet<>();
	
	
	public Author() {
	}

	public Author(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}

	public Author(String fName, String lName, Set<Book> books) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m_id == null) ? 0 : m_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (m_id == null) {
			if (other.m_id != null)
				return false;
		} else if (!m_id.equals(other.m_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookAuthor [m_id=" + m_id + ", fName=" + fName + ", lName=" + lName + ", books=" + books + "]";
	}
	
	
}