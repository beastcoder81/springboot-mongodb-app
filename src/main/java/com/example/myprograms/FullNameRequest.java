package com.example.myprograms;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "full_name_results")
public class FullNameRequest {
    @Id
    private String id;

    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;
}
