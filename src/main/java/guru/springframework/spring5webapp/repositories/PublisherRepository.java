package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.publisher;



public interface PublisherRepository extends CrudRepository<publisher, Long> {

}
