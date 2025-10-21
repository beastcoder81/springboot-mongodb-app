package com.example.myprograms.dao;

import com.example.myprograms.model.TransportResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.myprograms.enums.BatchStatus.COMPLETE;

@Slf4j
@Repository
public class TransportDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<TransportResponse> findTransportStatus(String batchStatus) {

        Query query = new Query();
        query.addCriteria(Criteria.where("batchStatus").ne(COMPLETE));

        List<TransportResponse> response = mongoTemplate.find(query, TransportResponse.class, "transport_status");

        return response;

    }

}
