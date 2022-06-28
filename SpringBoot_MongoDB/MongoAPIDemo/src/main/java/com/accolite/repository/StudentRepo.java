package com.accolite.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.accolite.collection.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student, Long>{

}
