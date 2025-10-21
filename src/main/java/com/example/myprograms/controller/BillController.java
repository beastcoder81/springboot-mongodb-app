package com.example.myprograms.controller;


import com.example.myprograms.model.BillResponse;
import com.example.myprograms.service.BillService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping("/bill")
    @ResponseBody
    public ResponseEntity<List<?>> getBillDetails(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(required = true) int size) {

        List<BillResponse> response = billService.getBillDetails(page, size);

        return ResponseEntity.ok(response);
    }

}
