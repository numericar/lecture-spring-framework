package guru.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.spring6webapp.domains.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
