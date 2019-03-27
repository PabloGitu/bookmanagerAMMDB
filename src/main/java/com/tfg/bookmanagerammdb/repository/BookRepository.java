package com.tfg.bookmanagerammdb.repository;

import com.tfg.bookmanagerammdb.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data MongoDB repository for the Book entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BookRepository extends MongoRepository<Book, String> {

    @Query("{ 'bookCover' : ?0 }")
    Page<Book> getBooksByCover(String cover, Pageable pageable);

}
