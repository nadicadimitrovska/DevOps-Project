package mk.ukim.finki.devops_project.service;

import mk.ukim.finki.devops_project.model.Order;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface OrderService {
    //Order placeOrder(String color, String size, String clientName, String address);
    Order placeOrder(String color, String size, String username, LocalDateTime dateCreated);
    List<Order> listAll();
    Optional<Order>findById(Long id);
    List<Order>findAllOrdersByDateBetween(LocalDateTime dateFrom, LocalDateTime dateTo);

}
