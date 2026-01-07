package com.phoenixware.shopify_integration.shopify_integration_backend.dao;

import com.phoenixware.shopify_integration.shopify_integration_backend.entity.Order;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderDAO {
    void saveOrder(Order order);
    Order getOrderById(Integer id);
    List<Order> getAllUnshippedOrdersFromTimestamp(LocalDateTime start);
    Order getOrderById(String id);
    List<Order> getAllUnshippedOrdersByMarketplace(List<String> marketplaces);
    List<Order> getAllOrders();
    int markShippedOrdersFulfilled();
    void shipOrder(Order order, String trackingNumber);
    void deleteOrder(Order order);
    void deleteOrderById(int id);
    int deleteCanceledOrders();
}
