package com.zb.demo.service;


import com.zb.demo.entity.UserTest;
import com.zb.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserTest> userFindList() {
        return userMapper.userFindList();
    }
}
