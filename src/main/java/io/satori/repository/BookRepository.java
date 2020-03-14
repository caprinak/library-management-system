package io.satori.repository;

import org.springframework.data.repository.CrudRepository;

import io.satori.models.Book;

/**
 * @author oktay
 *
 */
public interface BookRepository extends CrudRepository<Book, Integer>{

}
