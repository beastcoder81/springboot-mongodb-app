package com.example.myprograms.Dao;

import com.example.myprograms.Model.TrainPassengerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrainPassengerDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<TrainPassengerResponse> findPassengersByBatchStatus(String batchStatus) {

        Query query = new Query();
        query.addCriteria(Criteria.where("batchStatus").is(batchStatus));

        return mongoTemplate.find(query, TrainPassengerResponse.class, "train_passenger");

    }



}
