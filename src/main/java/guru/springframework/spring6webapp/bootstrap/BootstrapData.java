package guru.springframework.spring6webapp.bootstrap;

import guru.springframework.spring6webapp.model.Author;
import guru.springframework.spring6webapp.model.Book;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import guru.springframework.spring6webapp.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Log4j2
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        Author eric = Author.builder().firstName("Eric").lastName("Evan").build();
        Book ddd = Book.builder().title("Domain Driven Design").isbn("123456").build();

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = Author.builder().firstName("Rod").lastName("Johnson").build();
        Book noEJB = Book.builder().title("J2EE Development without EJB").isbn("54757585").build();

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        authorRepository.saveAll(Arrays.asList(ericSaved, rodSaved));

        log.info("In Bootstrap");
        log.info("Author Count: {}", authorRepository.count());
        log.info("Book Count: {}", bookRepository.count());
    }
}
