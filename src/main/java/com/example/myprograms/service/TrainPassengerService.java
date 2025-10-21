package com.example.myprograms.service;

import com.example.myprograms.dao.TrainPassengerDao;
import com.example.myprograms.model.TrainPassengerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainPassengerService {

    @Autowired
    private TrainPassengerDao trainPassengerDao;

    public List<TrainPassengerResponse> getPassengerInfo(int page, int size) {
        String batchStatus = "OPEN";
        return trainPassengerDao.findPassengersByBatchStatus(batchStatus);
    }
}
