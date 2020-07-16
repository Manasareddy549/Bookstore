package com.cap.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.entity.CategoryInfo;

public interface CategoryDaoI extends JpaRepository<CategoryInfo, Integer>{
	@Query("select c from CategoryInfo c")
	List<CategoryInfo> getCityNames();

}
