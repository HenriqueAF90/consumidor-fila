package com.henrique.queueconsumer.controller;



import com.henrique.queueconsumer.dto.OrderDTO;
import com.henrique.queueconsumer.model.Order;
import com.henrique.queueconsumer.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public void createOrder(@RequestBody OrderDTO dto){
        String mesage = "NOVO PEDIDO DE " + dto.customer() + " NO VALOR DE R$ " + dto.price();
        orderService.sendOrder(mesage);
    }
}

