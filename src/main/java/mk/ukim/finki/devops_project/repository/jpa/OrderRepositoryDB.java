package mk.ukim.finki.devops_project.repository.jpa;

import mk.ukim.finki.devops_project.model.Order;
import mk.ukim.finki.devops_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface
OrderRepositoryDB extends JpaRepository<Order,Long> {
    List<Order>findAllByUser(User user);
    List<Order>findByDateCreatedBetween(LocalDateTime dateFrom, LocalDateTime dateTo);
    Optional<Order>findByUser(User user);


}
