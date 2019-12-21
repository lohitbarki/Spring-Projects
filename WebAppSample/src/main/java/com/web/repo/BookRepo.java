package com.web.repo;

import org.springframework.data.repository.CrudRepository;

import com.web.core.Book;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public interface BookRepo extends CrudRepository<Book, Long> {

}
