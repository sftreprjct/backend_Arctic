package com.example.SpringMongoPoject.Repo;

import com.example.SpringMongoPoject.Entity.EmployeeGroup;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeGroupRepo extends MongoRepository<EmployeeGroup,Integer> {
}
