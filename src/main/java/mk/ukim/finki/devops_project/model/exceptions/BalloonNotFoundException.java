package mk.ukim.finki.devops_project.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class BalloonNotFoundException extends RuntimeException {
    public BalloonNotFoundException(Long id){super(String.format("Balloon with id: %d was not found",id));}
}
