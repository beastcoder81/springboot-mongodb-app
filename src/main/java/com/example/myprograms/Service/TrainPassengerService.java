package com.example.myprograms.Service;

import com.example.myprograms.Dao.TrainPassengerDao;
import com.example.myprograms.Model.TrainPassengerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TrainPassengerService {

    @Autowired
    private TrainPassengerDao trainPassengerDao;

    public List<TrainPassengerResponse> getPassengerInfo(int page, int size) {
        String batchStatus = "OPEN";
        return trainPassengerDao.findPassengersByBatchStatus(batchStatus);
    }
}
