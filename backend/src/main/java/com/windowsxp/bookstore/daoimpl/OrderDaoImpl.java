package com.windowsxp.bookstore.daoimpl;

import com.alibaba.fastjson.JSONObject;
import com.windowsxp.bookstore.dao.OrderDao;
import com.windowsxp.bookstore.entity.Order;
import com.windowsxp.bookstore.entity.OrderItem;
import com.windowsxp.bookstore.repository.OrderItemRepository;
import com.windowsxp.bookstore.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class OrderDaoImpl implements OrderDao {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderItemRepository orderItemRepository;

    @Override
    public void addOrder(Order order) {
        orderRepository.saveAndFlush(order);
    }

    @Override
    public void addOrderItem(OrderItem orderItem) {
        orderItemRepository.saveAndFlush(orderItem);
    }
}
