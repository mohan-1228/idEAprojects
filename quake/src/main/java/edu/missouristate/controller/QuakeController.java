package edu.missouristate.controller;

import edu.missouristate.model.ApiResponse;
import edu.missouristate.model.Features;
import edu.missouristate.model.Properties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Controller
public class QuakeController {
    @ResponseBody
    @GetMapping("/")
    public String getIndex() {
        String domain = "https://earthquake.usgs.gov/fdsnws/event/1/query";
        String format = "geojson";
        String startDate = "2014-01-01";
        String endDate = "2014-01-02";
        String minmagnitude = "1";
        String limit = "1";
        String queryString = "?format="+format;
        queryString +="&starttime="+startDate+"&endtime="+endDate;
        queryString +="&minmagnitude="+minmagnitude;
        queryString +="&limit=" +limit;
        String url = domain + queryString;
        RestTemplate restTemplate = new RestTemplate();
        ApiResponse apiResponse = restTemplate.getForObject(url, ApiResponse.class);
        Features features = apiResponse.getFeatures()[0];
        String id = features.getId();
        Properties properties = features.getProperties();
        String html =
                "";
        html+="<h1>Earthquake!</h1>";
        html+="<div><b>Place</b>: " + properties.getPlace() + "</div>";
        html+="<div><b>Time</b>: " + new Date(properties.getTime()).toLocaleString() + "</div>";
        html+="<div><b>Magnitude</b>: " + properties.getMag() + "</div>";
        html+="<div><b>ID</b>: " + features.getId() + "</div>";
        return html;
    }
}
