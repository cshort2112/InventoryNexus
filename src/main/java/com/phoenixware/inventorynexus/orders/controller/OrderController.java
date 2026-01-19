package com.phoenixware.inventorynexus.controller;

import com.phoenixware.inventorynexus.service.OrderService;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:      Collin Short
 * Copyright:   Phoenixware LLC 2026
 * Created:     1/19/2026
 */
@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController (OrderService orderService) {
        this.orderService = orderService;
    }
}
