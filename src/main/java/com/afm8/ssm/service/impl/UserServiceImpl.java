package com.afm8.ssm.service.impl;

import com.afm8.ssm.entity.TUser;
import com.afm8.ssm.mapper.TUserMapper;
import com.afm8.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    TUserMapper tUserMapper;

    @Override
    public TUser selectById(Long id) {
        return tUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer addUser(TUser user) {
        tUserMapper.insertSelective(user);
        return user.getId();
    }

    @Override
    public List<TUser> queryList(TUser user) {
        List<TUser> tUsers = tUserMapper.queryList(user);
        return tUsers;
    }
}
