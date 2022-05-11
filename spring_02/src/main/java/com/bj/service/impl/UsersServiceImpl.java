package com.bj.service.impl;

import com.bj.dao.UsersMapper;
import com.bj.dao.impl.UsersMapperImpl;
import com.bj.pojo.Users;
import com.bj.service.UsersService;
/*
    业务逻辑层的实现类
 */
public class UsersServiceImpl implements UsersService {

    private UsersMapper usersMapper = new UsersMapperImpl();

    @Override
    public int insert(Users users) {
        return usersMapper.insert(users);
    }
}
