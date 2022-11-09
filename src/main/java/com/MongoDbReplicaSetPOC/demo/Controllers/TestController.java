package com.MongoDbReplicaSetPOC.demo.Controllers;

import com.MongoDbReplicaSetPOC.demo.Entity.Student;
import com.MongoDbReplicaSetPOC.demo.Service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/test")
public class TestController {
    private final TestService service;
    @GetMapping("/check")
    public String checkFunction(){
        return "haha";
    }
    @GetMapping("/student")
    public String getListOfStudents(){
        return service.findByName("name").toString();
    }
    @GetMapping("/save")
    public Student saveStudent(@RequestBody Map<String,Object> dto){
        return service.addStudent(dto.get("name").toString(),dto.get("rollNumber").toString());
    }
}
