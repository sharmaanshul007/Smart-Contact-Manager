package controllers;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import entities.Book;

@RestController
public class BookController {
		
	@GetMapping("/test/{id}")
	public Book getBooks(@PathVariable("id") String id) {
		Book book = new Book();
		book.setTitle("Java");
		book.setId(1);
		book.setAuthor("Anshul");
		return book;
	}
}
