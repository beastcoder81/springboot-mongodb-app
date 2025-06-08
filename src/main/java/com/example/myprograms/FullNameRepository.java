package com.example.myprograms;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FullNameRepository extends MongoRepository<FullNameResult, String> {
}
