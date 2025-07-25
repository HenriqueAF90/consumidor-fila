package com.henrique.queueconsumer.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class Order {
    private String id;
    private String customer;
    private Double price;
    private String status;

    public Order(String id, String customer, Double price, String status) {
        this.id = id;
        this.customer = customer;
        this.price = price;
        this.status = status;
    }
}
