package com.example.myprograms.Model;

import com.example.myprograms.enums.Gender;
import lombok.Data;

import java.util.Date;

@Data
public class TrainPassengerResponse {
    private String firstName;
    private String lastName;
    private String trainNumber;
    private Date journeyDate;
    private String seatNumber;
    private String sourceStation;
    private String destinationStation;
    private Gender gender;
    private String mobileNumber;
    private String email;
    private Address address;
    private String batchStatus;

    @Data
    public static class Address {
        private String line1;
        private String city;
        private String state;
        private String zipcode;
    }
}
