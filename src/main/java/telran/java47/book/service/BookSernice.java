package telran.java47.book.service;

import telran.java47.book.dto.AuthorDto;
import telran.java47.book.dto.BookDto;

public interface BookSernice {
	boolean addBook(BookDto bookDto);

	BookDto findBookByIsbn(String isbn);

	BookDto removeBook(String isbn);

	BookDto updateBookTitle(String isbn, String title);

	Iterable<BookDto> findBooksByAuthor(String author);

	Iterable<BookDto> findBooksByPublisher(String publisher);

	Iterable<AuthorDto> findBookAuthors(String isbn);

	Iterable<String> findPublishersByAuthor(String author);

	AuthorDto removeAuthor(String author);

}
