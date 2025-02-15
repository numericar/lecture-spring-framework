package guru.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.spring6webapp.domains.Author;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorService authorService;

    public AuthorServiceImpl(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    public Iterable<Author> findAll() {
        return this.authorService.findAll();
    }

}
