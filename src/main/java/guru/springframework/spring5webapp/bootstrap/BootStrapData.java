package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository ) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}




	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Author eric = new Author("eric", "evans");
		Book ldd = new Book("Spring Boot","1222333");
		publisher pub = new publisher("Navneet Publications", "Bangalore");
		publisherRepository.save(pub);
		
		eric.getBook().add(ldd);
		ldd.getAuthors().add(eric);
		ldd.setPublishers(pub);
		pub.getBook().add(ldd);
		
		authorRepository.save(eric);
		bookRepository.save(ldd);
		publisherRepository.save(pub);
		
		Author rod = new Author("Rod","Johnson");
		Book pdd = new Book("Hello World","12321");
		rod.getBook().add(pdd);
		pdd.getAuthors().add(rod);
		
		authorRepository.save(rod);
		bookRepository.save(pdd);
		
		
		System.out.println("Authors: " + authorRepository.count());
		System.out.println("Books: " + bookRepository.count());
		System.out.println("Publishers: " + publisherRepository.count());
		
		
	}
	
	

}
