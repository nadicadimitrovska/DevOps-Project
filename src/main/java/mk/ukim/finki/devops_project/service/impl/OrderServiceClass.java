package mk.ukim.finki.devops_project.service.impl;

import mk.ukim.finki.devops_project.model.Order;

import mk.ukim.finki.devops_project.model.exceptions.UserNotFoundException;
import mk.ukim.finki.devops_project.repository.jpa.OrderRepositoryDB;

import mk.ukim.finki.devops_project.service.OrderService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceClass implements OrderService {

//    private final OrderRepository orderRepository;
//
//    public OrderServiceClass(OrderRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }
    private final OrderRepositoryDB orderRepository;



    public OrderServiceClass(OrderRepositoryDB orderRepository) {
        this.orderRepository = orderRepository;
    }



    @Override
//    public Order placeOrder(String color, String size, String clientName, String address) {
//        if (clientName==null || address==null || clientName.isEmpty() || address.isEmpty()){
//            throw new OrderNotFoundException();
//        }
//        Order order=new Order(color,size,clientName,address);
//        return this.orderRepository.newOrder(order);
//        //return orderRepository.save(color, size, clientName, address);
//    }
//    public Order placeOrder(String color, String size, String clientName, String address) {
//        if (clientName==null || address==null || clientName.isEmpty() || address.isEmpty()){
//            throw new OrderNotFoundException();
//        }
//        Order order=new Order(color,size);
//        return this.orderRepository.newOrder(order); ova funkcionira vo lab2
//        //return orderRepository.save(color, size, clientName, address);
//    }
    public Order placeOrder(String color, String size, String username, LocalDateTime dateCreated) {


        return this.orderRepository.save(new Order(color,size,dateCreated));

    }
    @Override
    public List<Order> listAll() {

//        return orderRepository.findAllOrders();
        return orderRepository.findAll();
    }



    @Override
    public Optional<Order> findById(Long id) {
        return this.orderRepository.findById(id);
    }

    @Override
    public List<Order> findAllOrdersByDateBetween(LocalDateTime dateFrom, LocalDateTime dateTo) {
        return orderRepository.findByDateCreatedBetween(dateFrom,dateTo);
    }
//    @Override
//    public Optional<Order> placeOrder(String balloonColor, String size, String clientName, String address) {
//        Optional<Order> order=this.orderRepository.placeOrder(balloonColor,size,clientName,address);
//        return (Optional<Order>) Optional.of(order);
//    }



}
