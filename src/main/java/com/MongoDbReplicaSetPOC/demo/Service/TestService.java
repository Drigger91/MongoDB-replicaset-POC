package com.MongoDbReplicaSetPOC.demo.Service;

import java.util.List;

import com.MongoDbReplicaSetPOC.demo.Entity.Student;
import com.MongoDbReplicaSetPOC.demo.Repository.TestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TestService {
    private TestRepository repository;

    public List<Student> findByRollNumber(String rollNumber){
        return repository.findByRollNumber(rollNumber);
    }
    public List<Student> findByName(String name){
        return repository.findByName(name);
    }
    public Student addStudent(String name , String rollNumber){
        var student = Student.builder().name(name).rollNumber(rollNumber).build();
        return repository.save(student);
    }
}
