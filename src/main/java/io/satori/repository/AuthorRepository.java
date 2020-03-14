package io.satori.repository;

import org.springframework.data.repository.CrudRepository;

import io.satori.models.Author;

/**
 * @author oktay
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Integer>{

}
