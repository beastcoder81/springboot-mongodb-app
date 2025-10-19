package com.example.myprograms;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "calculation_results")
public class CalculationResult {

    @Id
    private String id;
    private int number1;
    private int number2;
    private int addition;
    private int subtraction;
    private int multiplication;
    private double division;
}
