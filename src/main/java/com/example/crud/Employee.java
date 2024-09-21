package com.example.crud;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "employee")  // Corrected from collation to collection
public class Employee {
    private String id;  // Change this to String
    private String name;
    private String phone;
    private String email;
}
