package com.MongoDbReplicaSetPOC.demo.Entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Document("TestStudentRepo")
@Entity
@Data
@ToString
@AllArgsConstructor
@Builder
public class Student {
    @Id
    String id;
    private String name;
    private String rollNumber;
}
