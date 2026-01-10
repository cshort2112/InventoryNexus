package com.phoenixware.inventorynexus.repository;

import com.phoenixware.inventorynexus.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
