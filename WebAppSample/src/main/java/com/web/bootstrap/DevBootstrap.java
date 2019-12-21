package com.web.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.web.core.Author;
import com.web.core.Book;
import com.web.repo.AuthorRepo;
import com.web.repo.BookRepo;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

	private AuthorRepo authorRepo;
	private BookRepo bookRepo;
	
	public DevBootstrap(AuthorRepo authorRepo, BookRepo bookRepo) {
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initdata();
	}
	
	//Initialise Book and Author data
	private void initdata() {
		
		Author peterSiebel = new Author("Peter","Siebel");
		Book codersAtWork = new Book("Coders at Work", "2468", "Apress");
		peterSiebel.getBooks().add(codersAtWork);
		codersAtWork.getAuthors().add(peterSiebel);
		
		authorRepo.save(peterSiebel);
		bookRepo.save(codersAtWork);
		
		Author robertMartin = new Author("Robert","Martin");
		Book cleanCode = new Book("Clean Code", "13579", "GoodReads");
		robertMartin.getBooks().add(cleanCode);
		cleanCode.getAuthors().add(robertMartin);
		
		authorRepo.save(robertMartin);
		bookRepo.save(cleanCode);
	}
}
