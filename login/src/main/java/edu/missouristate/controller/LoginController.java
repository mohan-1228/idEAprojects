package edu.missouristate.controller;

import edu.missouristate.model.Login;
import edu.missouristate.model.Response;
import edu.missouristate.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class LoginController {
    @Autowired
    LoginService loginService;
    @ResponseBody
    @PostMapping("/login")
    public Response postLogin(@RequestBody Login login) {
        try {
            if (loginService.isAuthenticated(login)) {
                return new Response("success", "Login Successful");
            } else {
                return new Response("danger", "Login Unsuccessful. Please try again.");
            }
        } catch(Exception e) {
            return new Response("danger", "Sorry, internal error. Please try again.");
        }
    }
}
