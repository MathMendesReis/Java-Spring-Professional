package com.devsuperior.exercise.entitys;

import com.devsuperior.exercise.service.OrderService;
import com.devsuperior.exercise.service.ShippingService;

public class Order {
    private Integer code;
    private Double basic;
    private Double discount;
    private OrderService orderService;
    private ShippingService shippingService;

    public Order(Integer code, Double basic, Double discount, OrderService orderService,
            ShippingService shippingService) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
        this.orderService = orderService;
        this.shippingService = shippingService;
    };

    public Integer getCode() {
        return this.code;
    }

    public Double getBasic() {
        return this.basic;
    }

    public Double getDiscount() {
        return this.discount;
    }

    public OrderService getOrderService() {
        return this.orderService;
    }

    public ShippingService getShippingService() {
        return this.shippingService;
    }

}
