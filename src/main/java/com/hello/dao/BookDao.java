package com.hello.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hello.entity.Book;


/**
 * book接口
 * @author admin
 *
 */
public interface BookDao extends JpaRepository<Book, Integer>{

}
