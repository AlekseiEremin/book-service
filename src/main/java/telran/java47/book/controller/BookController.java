package telran.java47.book.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import telran.java47.book.dto.AuthorDto;
import telran.java47.book.dto.BookDto;
import telran.java47.book.service.BookSernice;

@RestController
@RequiredArgsConstructor
public class BookController {
	final BookSernice bookSernice;

	@PostMapping("/book")
	public boolean addBook(@RequestBody BookDto bookDto) {
		return bookSernice.addBook(bookDto);
	}

	@GetMapping("/book/{isbn}")
	public BookDto findBookByIsbn(@PathVariable String isbn) {
		return bookSernice.findBookByIsbn(isbn);
	}
	@DeleteMapping("/book/{isbn}")
	public BookDto removeBook( @PathVariable String isbn) {
		return bookSernice.removeBook(isbn);
	}

	@PutMapping("/book/{isbn}/title/{title}")
	public BookDto updateBookTitle(@PathVariable String isbn,@PathVariable String title) {
		return bookSernice.updateBookTitle(isbn, title);
	}

	@GetMapping("/books/author/{author}")
	public Iterable<BookDto> findBooksByAuthor(@PathVariable String author) {
		return bookSernice.findBooksByAuthor(author);
	}

	@GetMapping("/books/publisher/{publisher}")
	public Iterable<BookDto> findBooksByPublisher(@PathVariable String publisher) {
		return bookSernice.findBooksByPublisher(publisher);
	}

	@GetMapping("/authors/book/{isbn}")
	public Iterable<AuthorDto> findBookAuthors(@PathVariable String isbn) {
		return bookSernice.findBookAuthors(isbn);
	}

	@GetMapping("/publishers/author/{author}")
	public Iterable<String> findPublishersByAuthor(@PathVariable String author) {
		return bookSernice.findPublishersByAuthor(author);
	}

	@DeleteMapping("/author/{author}")
	public AuthorDto removeAuthor(@PathVariable String author) {
		return bookSernice.removeAuthor(author);
	}

}
