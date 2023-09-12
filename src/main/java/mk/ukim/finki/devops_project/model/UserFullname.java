package mk.ukim.finki.devops_project.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserFullname implements Serializable {

    private String name;
    private String surname;

    public UserFullname() {
    }
}
