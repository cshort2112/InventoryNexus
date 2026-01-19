package com.phoenixware.inventorynexus.dto;

import com.phoenixware.inventorynexus.entity.OrderItem;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

/**
 * Author:      Collin Short
 * Copyright:   Phoenixware LLC 2026
 * Created:     1/19/2026
 */
@Data
@Builder
public class OrderDTO {
    private UUID id;
    private int viewableId;
    private Set<OrderItem> orderItems;
    private String name;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String postalCode;
    private BigDecimal total;
    private LocalDateTime creationTimestamp;
    private boolean shipped;
    private boolean fulfilled;
    private String trackingNumber;
    private String marketplace;
    private String status;
}
