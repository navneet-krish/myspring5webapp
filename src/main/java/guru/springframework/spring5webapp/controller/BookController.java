package guru.springframework.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.BookRepository;

@Controller
public class BookController {
	
	private final BookRepository bookRepository;
	
	
	
	public BookController(BookRepository bookRepository) {
			this.bookRepository = bookRepository;
	}



	@RequestMapping("/booklist")
	public String getBooks(Model model) {
		
		System.out.println("books: " + bookRepository.findAll());
		model.addAttribute("books",bookRepository.findAll());
		return "booklist";
	}

}