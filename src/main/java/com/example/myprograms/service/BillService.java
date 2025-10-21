package com.example.myprograms.service;

import com.example.myprograms.dao.BillDao;
import com.example.myprograms.model.BillResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BillService {

    @Autowired
    private BillDao billDao;

    public List<BillResponse> getBillDetails(int page, int size) {

        String orderNumber = "A129";

        List<BillResponse> response = billDao.findBillDetails(orderNumber);

        return response;
    }
}
