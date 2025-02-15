package guru.springframework.spring6webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring6webapp.domains.Author;
import guru.springframework.spring6webapp.domains.Book;
import guru.springframework.spring6webapp.domains.Publisher;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import guru.springframework.spring6webapp.repositories.BookRepository;
import guru.springframework.spring6webapp.repositories.PublisherRepository;

// CommandLineRunner เป็น interface ที่ใช้สำหรับการรัน method หลังจากที่ Spring Boot Application ถูกเรียกใช้งาน
@Component // annotation สำหรับระบุว่า class นี้เป็น component ที่จะถูกสร้างขึ้นมาเมื่อ Spring Boot Application ถูกเรียกใช้งาน
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("1234");
        
        Author ericSaved = this.authorRepository.save(eric);
        Book dddSaved = this.bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("2345");

        Author rodSaved = this.authorRepository.save(rod);
        Book noEJBSaved = this.bookRepository.save(noEJB);

        Publisher publisher = new Publisher();
        publisher.setPublisherName("SFG Publishing");
        publisher.setAddress("1234 Street");
        publisher.setCity("Bangkok");
        publisher.setState("Bangkhen");
        publisher.setZip("10220");
        Publisher publisherSabed = this.publisherRepository.save(publisher);

        ddd.setPublisher(publisherSabed);
        noEJB.setPublisher(publisherSabed);
        
        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);
        dddSaved.getAuthors().add(ericSaved);
        noEJBSaved.getAuthors().add(rodSaved);

        this.bookRepository.save(ddd);
        this.bookRepository.save(noEJB);
        this.authorRepository.save(ericSaved);
        this.authorRepository.save(rodSaved);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Authors: " + this.authorRepository.count());
        System.out.println("Number of Books: " + this.bookRepository.count());
        System.out.println("Number of Publishers: " + this.publisherRepository.count());
    }

}
