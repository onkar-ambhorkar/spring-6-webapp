package guru.springframework.spring6webapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.spring6webapp.model.Author;
import guru.springframework.spring6webapp.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
    
}
