package mk.ukim.finki.devops_project.service;

import mk.ukim.finki.devops_project.model.User;

public interface AuthService {
    User login(String username, String password);


//    User register(String username, String password, String repeatPassword,
//                  UserFullname userFullname, LocalDate dateOfBirth);
}
