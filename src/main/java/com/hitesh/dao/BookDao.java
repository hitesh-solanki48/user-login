package com.hitesh.dao;

import java.util.List;
import com.hitesh.model.Book;

public interface BookDao {

	void save(Book book);

	void delete(Book book);

	Book findById(int id);

	public void deleteBookById(Integer id);

	public List<Book> findAvailable(String available);

	public List<Book> findAllBooks();
}
