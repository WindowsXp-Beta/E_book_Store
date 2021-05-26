package com.windowsxp.bookstore.dao;

import com.windowsxp.bookstore.entity.CartItem;

import java.util.List;
import java.util.Map;

public interface CartDao {
    List<CartItem> getCart(Integer userId);
    void addCart(CartItem cartItem);
    void deleteCart(Integer itemId);
    void editCartItemNum(Integer itemId, Integer bookNum);
}
