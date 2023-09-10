package mk.ukim.finki.devops_project.repository.jpa;

import mk.ukim.finki.devops_project.model.ShoppingCart;
import mk.ukim.finki.devops_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShoppingCartRepositoryDB extends JpaRepository<ShoppingCart,Long> {
    Optional<ShoppingCart> findByUser(User user);

}
