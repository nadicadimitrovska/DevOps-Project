package mk.ukim.finki.devops_project.service;

import mk.ukim.finki.devops_project.model.User;
import mk.ukim.finki.devops_project.model.UserFullname;
import org.springframework.security.core.userdetails.UserDetailsService;

import mk.ukim.finki.devops_project.model.Role;
import java.time.LocalDate;

public interface UserService extends UserDetailsService {

    User register(String username, String password, String repeatPassword, UserFullname userFullname, LocalDate dateOfBirth, Role role);


}

