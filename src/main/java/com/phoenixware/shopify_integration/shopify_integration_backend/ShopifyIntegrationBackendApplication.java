package com.phoenixware.shopify_integration.shopify_integration_backend;

import com.phoenixware.shopify_integration.shopify_integration_backend.dao.OrderDAO;
import com.phoenixware.shopify_integration.shopify_integration_backend.entity.Order;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class ShopifyIntegrationBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopifyIntegrationBackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(OrderDAO orderDAO) {
        return runner -> {
//            getOrder(orderDAO);
//            createOrder(orderDAO);
//            getAllUnshippedOrders(orderDAO);
            // Mark order as shipped.
//            Order orderToShip = getOrder(orderDAO, 7);
//            shipOrder(orderDAO, orderToShip, "1Z1251234512");
//            IO.println(orderToShip);
            // delete canceled orders
        };
    }

    private void getAllUnshippedOrders(OrderDAO orderDAO) {
        System.out.println("Getting Orders...");
        LocalDateTime theTimestamp = LocalDateTime.parse("2026-01-07T11:30:16.782002");
        List<Order> orders = orderDAO.getAllUnshippedOrdersFromTimestamp(theTimestamp);
        for (Order order : orders) {
            IO.println(order.toString());
        }
    }

    private void shipOrder(OrderDAO orderDAO, Order order, String trackingNumber) {
        orderDAO.shipOrder(order, trackingNumber);
    }

    private Order getOrder(OrderDAO orderDAO, int orderId) {
        System.out.println("Getting order");
        Order order = orderDAO.getOrderById(orderId);
        System.out.println("Order: " + order);
        return order;
    }

    private void createOrder(OrderDAO orderDAO) {
        System.out.println("Creating order");
        Order order = new Order("Bob Upton", "7 Diane rd", "1", "Columbia Falls", "MT", "59912", BigDecimal.valueOf(599.00), "Webment");

        System.out.println("Saving order");
        orderDAO.saveOrder(order);

        System.out.println("Order saved" + order.getId());
    }
}
