package com.example.myprograms.Service;

import com.example.myprograms.Dao.TrainPassengerDao;
import com.example.myprograms.Dao.TransportDao;
import com.example.myprograms.Model.TransportResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.example.myprograms.enums.BatchStatus.COMPLETE;

@Slf4j
@Service
public class TransportService {

    @Autowired
    private TransportDao transportDao;

    public List<TransportResponse> getTransportStatus(int page, int size) {

        String batchStatus = "COMPLETE";

        List<TransportResponse> response = transportDao.findTransportStatus(batchStatus);

        return response;
    }
}
