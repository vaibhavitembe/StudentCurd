package com.zplus.student.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="student_details")
public class StudentMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentId;

    private String studentName;

    private String age;

    private String marks;

    private String address;

    private String status;

}
