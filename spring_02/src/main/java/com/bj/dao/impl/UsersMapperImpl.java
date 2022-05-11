package com.bj.dao.impl;

import com.bj.dao.UsersMapper;
import com.bj.pojo.Users;
/*
    数据访问层的实现类
 */
public class UsersMapperImpl implements UsersMapper {
    @Override
    public int insert(Users u) {
        System.out.println(u.getUname() + "用户增加成功");
        return 1;

    }
}
