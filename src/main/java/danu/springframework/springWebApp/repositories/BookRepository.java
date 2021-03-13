package danu.springframework.springWebApp.repositories;

import danu.springframework.springWebApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
