package danu.springframework.springWebApp.repositories;

import danu.springframework.springWebApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
