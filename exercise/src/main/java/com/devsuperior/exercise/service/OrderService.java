package com.devsuperior.exercise.service;

import org.springframework.stereotype.Service;

import com.devsuperior.exercise.entitys.Order;
@Service
public class OrderService {

    public Double total(Order order){
        return order.getBasic() * (order.getDiscount() /100);
    }
}
