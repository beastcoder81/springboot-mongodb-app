package com.example.myprograms.Controller;

import com.example.myprograms.Model.TransportResponse;
import com.example.myprograms.Service.TransportService;
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
public class TransportController {

    @Autowired
    private TransportService transportService;

    @GetMapping("/transport/status")
    @ResponseBody
    public ResponseEntity<List<?>> getTransportStatus(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {

        List<TransportResponse> response = transportService.getTransportStatus(page, size);

        return ResponseEntity.ok(response);
    }

}
