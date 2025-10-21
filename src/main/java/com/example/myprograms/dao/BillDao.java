package com.example.myprograms.dao;


import com.example.myprograms.model.BillResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.myprograms.enums.orderNumber.A129;

@Slf4j
@Repository
public class BillDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<BillResponse> findBillDetails(String orderNumber) {

        Query query = new Query();
        query.addCriteria(Criteria.where("orderNumber").ne(A129));
    List<BillResponse> response = mongoTemplate.find(query, BillResponse.class, "bill_details");

    return response;
    }
}
