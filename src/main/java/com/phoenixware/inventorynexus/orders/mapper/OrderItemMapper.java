package com.phoenixware.inventorynexus.mapper;

import com.phoenixware.inventorynexus.dto.OrderDTO;
import com.phoenixware.inventorynexus.dto.OrderItemDTO;
import com.phoenixware.inventorynexus.entity.Order;
import com.phoenixware.inventorynexus.entity.OrderItem;
import org.mapstruct.Mapper;

/**
 * Author:      Collin Short
 * Copyright:   Phoenixware LLC 2026
 * Created:     1/19/2026
 */
@Mapper
public interface OrderItemMapper {

    OrderItem orderItemDtoToOrderItem(OrderItemDTO orderItemDTO);

    OrderItemDTO orderItemToOrderItemDto(OrderItem orderItem);
}
