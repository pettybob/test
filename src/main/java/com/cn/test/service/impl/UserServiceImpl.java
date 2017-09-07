package com.cn.test.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.test.dao.UserMapper;
import com.cn.test.domain.User;
import com.cn.test.service.UserService;

@Service("userService")  
public class UserServiceImpl implements UserService {  
    @Resource  
    private UserMapper userDao;  
    @Override  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
  
}  