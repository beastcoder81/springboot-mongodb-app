package com.example.myprograms.model;

import lombok.Data;

@Data
public class BillResponse {
    private String orderNumber;
    private String orderName;
    private String mobileNumber;
    private String email;
    private int orderTotal;

}
