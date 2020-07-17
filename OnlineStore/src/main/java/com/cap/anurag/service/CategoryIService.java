package com.cap.anurag.service;

import java.util.List;
import java.util.Optional;

import com.cap.anurag.entity.Book;
import com.cap.anurag.entity.Category;

public interface CategoryIService {
	Category addCategory (Category category);
	Book addBook (Book book);
	Book btoC(int cid,int bid);
	public Category UpdateCategory(Category c);
	Optional<Category> getCategoryById(int cid);
	List<Category> getAllCategory();
	List<Book> listOfBook();
	public Book updateBook (Book book);
	String removeCategory(Integer CategoryId);
	String removeBook(Integer bid);

}