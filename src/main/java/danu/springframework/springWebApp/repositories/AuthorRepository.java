package danu.springframework.springWebApp.repositories;

import danu.springframework.springWebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
