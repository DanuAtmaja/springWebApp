package danu.springframework.springWebApp.bootstrap;

import danu.springframework.springWebApp.model.Author;
import danu.springframework.springWebApp.model.Book;
import danu.springframework.springWebApp.repositories.AuthorRepository;
import danu.springframework.springWebApp.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

//      Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design","1234","Harper Collins");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

//      Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEjb = new Book("J2EE Development without EJB","9876","Worx");
        rod.getBooks().add(noEjb);

        authorRepository.save(rod);
        bookRepository.save(noEjb);
    }
}
