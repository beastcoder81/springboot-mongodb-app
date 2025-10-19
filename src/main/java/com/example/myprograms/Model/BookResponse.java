package com.example.myprograms.Model;

import lombok.Data;

@Data
public class BookResponse {
    private String bookId;
    private String title;
    private String author;
    private String price;
    private Publisher publisher;
    private String availabilityStatus;

    @Data
    public class Publisher {
        private String name;
        private String city;
    }
}
