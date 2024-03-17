package edu.missouristate.service;

import edu.missouristate.model.Login;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean isAuthenticated(Login login) {
        if (login != null) {
            if ("admin".equalsIgnoreCase(login.getUserId()) &&
                    "admin".equals(login.getPassword())) {
                return true;
            }
        }
        return false;
    }

}
