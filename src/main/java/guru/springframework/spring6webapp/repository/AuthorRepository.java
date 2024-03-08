package guru.springframework.spring6webapp.repository;

import guru.springframework.spring6webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
