package com.web.repo;

import org.springframework.data.repository.CrudRepository;

import com.web.core.Author;

public interface AuthorRepo extends CrudRepository<Author, Long> {

}
