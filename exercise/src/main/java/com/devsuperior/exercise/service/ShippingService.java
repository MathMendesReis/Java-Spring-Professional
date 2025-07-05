package com.devsuperior.exercise.service;

import org.springframework.stereotype.Service;

import com.devsuperior.exercise.entitys.Order;

@Service
public class ShippingService {
    public Double shipment(Order order) {
        // R$ 200.00 ou mais
        Double freight = 0.0;
        // Abaixo de R$ 100.00 R$ 20.00
        if (order.getBasic() <= 100.00) {
            freight = 20.00;
            return freight;

        }
        // De R$ 100.00 até R$ 200.00 exclusive R$ 12.00
        if (order.getBasic() >= 100.00 && order.getBasic() <= 200.00) {
            freight = 12.00;
            return freight;

        }
        return freight;
    }
}
