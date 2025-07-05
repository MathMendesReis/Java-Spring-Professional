package com.devsuperior.exercise;

import java.text.NumberFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.exercise.entitys.Order;
import com.devsuperior.exercise.service.OrderService;
import com.devsuperior.exercise.service.ShippingService;
import java.util.Locale;

@SpringBootApplication
public class ExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseApplication.class, args);

		Order Exemplo1 = new Order(1034, 150.00, 20.0, new OrderService(), new ShippingService());
		Order Exemplo2 = new Order(2282, 800.00, 10.0, new OrderService(), new ShippingService());
		Order Exemplo3 = new Order(1309, 95.00, 0.0, new OrderService(), new ShippingService());

		ExerciseApplication app = new ExerciseApplication();

		app.print(Exemplo1);
		app.print(Exemplo2);
		app.print(Exemplo3);

	}

	public void print(Order order) {
		Locale localeBrasil = new Locale("pt", "BR");
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeBrasil);
		Double shipment = order.getShippingService().shipment(order);
		Double discount = order.getOrderService().total(order);

		Double calc = order.getBasic() - discount + shipment;

		System.out.println("");
		System.out.println("####");
		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: " + numberFormat.format(calc));

		// System.out.println("Desconto: " + order.getOrderService().total(order));
		// System.out.println("Frete: " + order.getShippingService().shipment(order));

		System.out.println("####");
		System.out.println("");
	};
}
