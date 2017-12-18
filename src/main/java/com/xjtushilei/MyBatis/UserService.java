package com.xjtushilei.MyBatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getall() {
        return userMapper.getall();

    }

    public User getById(long id) {
        return userMapper.getById(id);
    }

    public String getNameById(long id) {
        return userMapper.getNameById(id);
    }

}
