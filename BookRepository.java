package com.gl.lib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.lib.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
