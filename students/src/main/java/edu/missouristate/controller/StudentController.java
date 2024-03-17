// Mohan Thapa
package edu.missouristate.controller;

import edu.missouristate.model.ApiResponse;
import edu.missouristate.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class StudentController {

    @ResponseBody
    @GetMapping("/")
    public String getIndex() {

        String apiUrl = "http://localhost:8080/v1/students?format=json&limit=1";
        RestTemplate restTemplate = new RestTemplate();
        ApiResponse response = restTemplate.getForObject(apiUrl, ApiResponse.class);
        Student student = response.getStudents()[0];

        // Extract student properties
        String firstName = student.getFirstName();
        String lastName = student.getLastName();
        int age = student.getAge();
        String major = student.getMajor();
        double gpa = student.getGpa();

        String html = "";
        html+="<h1>Students</h1>";
        html += "<div><b>First Name</b>: " + student.getFirstName() + "</div>";
        html += "<div><b>Last Name</b>: " + student.getLastName() + "</div>";
        html += "<div><b>Age</b>: " + student.getAge() + "</div>";
        html += "<div><b>Major</b>: " + student.getMajor() + "</div>";
        html += "<div><b>GPA</b>: " + student.getGpa() + "</div>";
        html += "<hr/>";

        // Return HTML response
        return html;

    }

}
