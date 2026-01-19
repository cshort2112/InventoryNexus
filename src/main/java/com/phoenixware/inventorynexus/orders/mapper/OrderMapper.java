package com.phoenixware.inventorynexus.mapper;

import com.phoenixware.inventorynexus.dto.OrderDTO;
import com.phoenixware.inventorynexus.entity.Order;
import org.mapstruct.Mapper;

/**
 * Author:      Collin Short
 * Copyright:   Phoenixware LLC 2026
 * Created:     1/19/2026
 */
@Mapper
public interface OrderMapper {
    Order orderDtoToOrder(OrderDTO orderDTO);

    OrderDTO orderToOrderDto(Order order);
}
