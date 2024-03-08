package guru.springframework.spring6webapp.repositories;

import guru.springframework.spring6webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
