package com.example.blog_restfull.repository;
import com.example.blog_restfull.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Query(value = "select * from blog where category_id = :id", nativeQuery = true)
    List<Blog> showListByCategory(@Param("id") int id);

    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);
}
