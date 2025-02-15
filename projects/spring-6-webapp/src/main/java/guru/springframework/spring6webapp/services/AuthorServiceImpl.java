package guru.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.spring6webapp.domains.Author;
import guru.springframework.spring6webapp.repositories.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override // annotation สำหรับระบุว่า method นี้เป็นการ override method จาก interface หรือ superclass
    public Iterable<Author> findAll() {
        return this.authorRepository.findAll();
    }

}
