package com.windowsxp.bookstore.serviceimpl;

import com.windowsxp.bookstore.dao.UserDao;
import com.windowsxp.bookstore.entity.CartItem;
import com.windowsxp.bookstore.entity.Order;
import com.windowsxp.bookstore.entity.User;
import com.windowsxp.bookstore.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password){
        return userDao.checkUser(username,password);
    }

    @Override
    public User getUser(Integer id){
        return userDao.getUser(id);
    }

}
