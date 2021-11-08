package com.zplus.student.controller;

import com.zplus.student.dto.StudentDto;
import com.zplus.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value="studentDetails")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    private ResponseEntity insertStudent(@RequestBody StudentDto studentDto) {
        Boolean flag = studentService.studentService(studentDto);
        if (flag)

            return new ResponseEntity(flag, HttpStatus.OK);
        else
            return new ResponseEntity(flag, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/hello")
    public String hello(){

        return "Hello Vaibhavi Tembe , " +
                "Welcome To Here";
    }

}

