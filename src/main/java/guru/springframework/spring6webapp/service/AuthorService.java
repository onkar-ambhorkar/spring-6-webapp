package guru.springframework.spring6webapp.service;

import guru.springframework.spring6webapp.model.Author;

public interface AuthorService {
    
    Iterable<Author> findAll();
}
