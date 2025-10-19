package com.example.myprograms.Controller;

import com.example.myprograms.Model.TrainPassengerResponse;
import com.example.myprograms.Service.TrainPassengerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class TrainPassengerController {

    @Autowired
    private TrainPassengerService trainPassengerService;

    @GetMapping("/passenger-info")
    @ResponseBody
    public ResponseEntity<List<TrainPassengerResponse>> getPassengerInfo(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {

        List<TrainPassengerResponse> response = trainPassengerService.getPassengerInfo(page, size);
        return ResponseEntity.ok(response);

    }

}