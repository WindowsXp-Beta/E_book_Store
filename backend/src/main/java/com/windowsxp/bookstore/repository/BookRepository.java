package com.windowsxp.bookstore.repository;

import com.windowsxp.bookstore.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Page<Book> getAllByInventoryGreaterThan(Integer inventory, Pageable pageable);
}