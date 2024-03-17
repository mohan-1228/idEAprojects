// Mohan Thapa
package edu.missouristate.controller;

import edu.missouristate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@RestController
public class StudentRestController {

    @Autowired
    StudentService studentService;

    @GetMapping("/v1/students")
    public String getStudentData(String limit, String format) throws Exception {
        return studentService.getStudents(limit, format);
    }

}
