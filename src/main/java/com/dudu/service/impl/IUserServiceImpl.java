package com.dudu.service.impl;

import com.dudu.core.AbstractService;
import com.dudu.dao.UserMapper;
import com.dudu.domain.User;
import com.dudu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl extends AbstractService<User> implements IUserService {
    @Autowired
    private UserMapper userMapper;
}
