package com.tfg.bookmanagerammdb.repository;

import com.tfg.bookmanagerammdb.domain.Publisher;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data MongoDB repository for the Publisher entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PublisherRepository extends MongoRepository<Publisher, String> {

}
