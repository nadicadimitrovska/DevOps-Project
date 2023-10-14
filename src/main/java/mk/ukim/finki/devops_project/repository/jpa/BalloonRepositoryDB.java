package mk.ukim.finki.devops_project.repository.jpa;

import mk.ukim.finki.devops_project.model.Balloon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BalloonRepositoryDB extends JpaRepository<Balloon,Long> {

    List<Balloon> findAllByNameOrDescription(String name, String description);
    List<Balloon> searchAllByNameOrDescription(String text,String desc);
}
