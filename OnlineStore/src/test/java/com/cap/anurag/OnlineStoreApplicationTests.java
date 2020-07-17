package com.cap.anurag;


import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cap.anurag.dao.CategoryDao;
import com.cap.anurag.entity.Book;
import com.cap.anurag.entity.Category;
import com.cap.anurag.service.CategoryIService;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class OnlineStoreApplicationTests {

	@Autowired
	private CategoryIService as;
	
	@MockBean
	CategoryDao crep;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void addBookTest(){
		Book b=new Book();
		as.addBook(b);
		assertEquals("Richa Gupta",b.getAuthor());
	}
	@Test
	public void addBookTest1(){
		Book b=new Book();
		as.addBook(b);
		assertNotEquals("Richa Gupta",b.getAuthor());
	}
	
	@Test
	public void addCategoryTest() {
		Category c=new Category(101,"Horror",null);
		as.addCategory(c);
		assertEquals("Horror",c.getCategoryName());
	}

	@Test
	public void addCategoryTest1() {
		Category c=new Category(101,"Horror",null);
		as.addCategory(c);
		assertNotEquals("Horror",c.getCategoryName());
	}
	

	@Test
	public void UpdateCategoryTest() {
		Category c=new Category(101,"Horror",null);
		as.addCategory(c);
		c.setCategoryName("fantasy");
		as.UpdateCategory(c);
		//verify(crep,times(1)).save(c);
		assertEquals("fantasy",c.getCategoryName());
	}
/*
	@Test
	public void UpdateCategoryTest1() {
		Category c=new Category(101,"Horror",null);
		as.addCategory(c);
		c.setCategoryName("fantasy");
		as.UpdateCategory(c);
		//verify(crep,times(1)).save(c);
		assertNotEquals("fantasy",c.getCategoryName());
	}
	*/


}