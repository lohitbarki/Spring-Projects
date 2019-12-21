package com.web.core;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long m_id;
	private String m_name;
	private String m_isbn;
	private String m_publisher;
	
	@ManyToMany
	@JoinTable(name = "authorsAndBooks",joinColumns = @JoinColumn(name="book_m_id"),
	inverseJoinColumns = @JoinColumn(name="author_m_id"))
	private Set<Author> m_authors = new HashSet<>();
	
	public Book() {
	}

	public Book(String m_name, String m_isbn, String m_publisher) {
		this.m_name = m_name;
		this.m_isbn = m_isbn;
		this.m_publisher = m_publisher;
	}

	public Book(String m_name, String m_isbn, String m_publisher, Set<Author> m_authors) {
		this.m_name = m_name;
		this.m_isbn = m_isbn;
		this.m_publisher = m_publisher;
		this.m_authors = m_authors;
	}

	
	public Long getId() {
		return m_id;
	}

	public void setId(Long m_id) {
		this.m_id = m_id;
	}

	public String geName() {
		return m_name;
	}

	public void setName(String m_name) {
		this.m_name = m_name;
	}

	public String getIsbn() {
		return m_isbn;
	}

	public void setIsbn(String m_isbn) {
		this.m_isbn = m_isbn;
	}

	public String getPublisher() {
		return m_publisher;
	}

	public void setPublisher(String m_publisher) {
		this.m_publisher = m_publisher;
	}

	public Set<Author> getAuthors() {
		return m_authors;
	}

	public void setAuthors(Set<Author> m_authors) {
		this.m_authors = m_authors;
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
		Book other = (Book) obj;
		if (m_id == null) {
			if (other.m_id != null)
				return false;
		} else if (!m_id.equals(other.m_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [m_id=" + m_id + ", m_name=" + m_name + ", m_isbn=" + m_isbn + ", m_publisher=" + m_publisher
				+ ", m_authors=" + m_authors + "]";
	}
	
	
}