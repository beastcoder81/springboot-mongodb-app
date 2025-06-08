package com.example.myprograms;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CalculationRepository extends MongoRepository<CalculationResult, String> {
}
