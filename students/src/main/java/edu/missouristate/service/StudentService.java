// Mohan Thapa
package edu.missouristate.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.xml.XmlMapper;
import edu.missouristate.controller.StudentRestController;
import edu.missouristate.helper.Helper;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public String getStudents(String limit, String format) throws Exception {
        Integer limitInt = (Helper.isInteger(limit)) ? Integer.parseInt(limit) : 100;
        limitInt = (limitInt < 1 || limitInt > 100) ? 100 : limitInt;
        InputStream inputStream = StudentService.class.getResourceAsStream("/data.txt");
        List<String> studentList = Helper.getStudentList(inputStream);

        if ("xml".equalsIgnoreCase(format)) {
            String jsonString = Helper.getStudentsJson(limitInt, studentList);
            JSONObject jsonObject = new JSONObject(jsonString);
            return XML.toString(jsonObject);
        } else if ("json".equalsIgnoreCase(format)) {
            String jsonString = Helper.getStudentsJson(limitInt, studentList);
            return jsonString;
        } else {
            return Helper.getStudentsText(limitInt, studentList);
        }
    }

}
