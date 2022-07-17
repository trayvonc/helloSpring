package com.fan.service;

import com.fan.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    public void setUserDao(UserDao dao){
        this.userDao=dao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
