package com.cg.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.app.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Long>{

}
