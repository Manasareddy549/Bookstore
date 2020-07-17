package com.cap.anurag.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.anurag.entity.Book;

public interface BookDao extends JpaRepository<Book, Integer>{


}
