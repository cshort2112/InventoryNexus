package com.phoenixware.inventorynexus.dto;

import com.phoenixware.inventorynexus.entity.Order;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Author:      Collin Short
 * Copyright:   Phoenixware LLC 2026
 * Created:     1/19/2026
 */
@Data
@Builder
public class OrderItemDTO {
    private UUID id;
    private UUID orderId;
    private int viewableId;
    private int viewableOrderId;
    private Order order;
    private String sku;
    private String title;
    private BigDecimal price;
    private int quantity;
    private LocalDateTime creationTimestamp;
}
