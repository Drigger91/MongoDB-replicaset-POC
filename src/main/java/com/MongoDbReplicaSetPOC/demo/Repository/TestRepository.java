package com.MongoDbReplicaSetPOC.demo.Repository;

import com.MongoDbReplicaSetPOC.demo.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.*;


@Repository("testRepo")
public interface TestRepository extends MongoRepository<Student,String>{
    List<Student> findByRollNumber(String rollNumber);
    List<Student> findByName(String name);
    Student save(Student student);
}
