package telran.java47.book.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import telran.java47.book.model.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, String> {

	Stream<Book> findByAuthorsNameIgnoreCase(String name);

	@Query("select b from Book b where b.publisher.publisherName=?1")
	Stream<Book> findByPublisher(String publisher);

}
