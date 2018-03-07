package com.hitesh.service;

import java.util.List;
import com.hitesh.model.Book;

public interface BookService {

	void save(Book book);

	void delete(Book book);

	Book findById(int id);

	public void deleteBookById(Integer id);

	public List<Book> findAvailable(String available);

	public List<Book> findAllBooks();

	public void updateBook(Book book);
}
