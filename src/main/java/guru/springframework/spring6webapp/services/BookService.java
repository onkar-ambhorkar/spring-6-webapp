package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.model.Book;

public interface BookService {

    Iterable<Book> findAll();

}
