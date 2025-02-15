package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domains.Book;

public interface BookService {
    Iterable<Book> findAll();
}   
