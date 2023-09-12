package mk.ukim.finki.devops_project.model.exceptions;

public class InvalidUserCredentialsException extends RuntimeException{
    public InvalidUserCredentialsException() {
        super("Invalid user credentials exception");
    }
}
