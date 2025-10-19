package com.example.myprograms.Service;

import com.example.myprograms.Dao.BooksAvailabilityDao;
import com.example.myprograms.Model.BookResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BooksAvailabilityService {

    @Autowired
    private BooksAvailabilityDao booksAvailabilityDao;

    public List<BookResponse> getBooksAvailability(int page, int size) {

        log.info("service call: get books availability(page={}, size={})", page, size);

        String availabilityStatus = "AVAILABLE";
        log.debug("Availability status set to = {}", availabilityStatus);

        String author = "James Gosling";
        log.debug("author set to {}", author);

        String bookId = "B101";
        log.debug("bookId set to {}", bookId);

        List<BookResponse> response = booksAvailabilityDao.findBooksAvailability(availabilityStatus, author, bookId);

        log.info("Books fetched from DAO, total count = {}", response.size());
        log.debug("Books response: {}", response);

        return response;

    }

}