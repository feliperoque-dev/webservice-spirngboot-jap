package com.webservice.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.course.entities.OrderItem;
import com.webservice.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
