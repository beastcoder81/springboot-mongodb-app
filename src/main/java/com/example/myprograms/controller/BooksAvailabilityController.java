package com.example.myprograms.controller;

import com.example.myprograms.model.BookResponse;
import com.example.myprograms.service.BooksAvailabilityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class BooksAvailabilityController {

    @Autowired
    private BooksAvailabilityService booksAvailabilityService;

    @GetMapping("/books/available")
    @ResponseBody
    public ResponseEntity<List<?>> getBooksAvailiability(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {

        log.info("Request received: /books/available&page={}&size={}", page, size );

        List<BookResponse> response = booksAvailabilityService.getBooksAvailability(page, size);

        log.info("Books retrieved successfully,total count={}", response.size());

        return ResponseEntity.ok(response);
    }

}
