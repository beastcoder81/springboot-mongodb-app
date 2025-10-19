package com.example.myprograms.Dao;

import com.example.myprograms.Model.BookResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository

public class BooksAvailabilityDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<BookResponse> findBooksAvailability(String availabilityStatus, String author, String bookId) {

        log.info("Dao call: findBooksAvailability(availabilityStatus={}, author={})", availabilityStatus, author);

        Query query = new Query();

        query.addCriteria(Criteria.where("availabilityStatus").is(availabilityStatus).and("author").is(author).and("bookId").is(bookId));

        log.debug("Mango query criteria: {}", query.getQueryObject());

        List<BookResponse> response = mongoTemplate.find(query, BookResponse.class, "library_books");

        log.info("MongoDB query executed successfully, records fetched = {}", response.size());
        log.debug("Fetched records: {}", response);

        return response;

    }

}
