package com.afm8.ssm.service;

import com.afm8.ssm.entity.TUser;

import java.util.List;

public interface UserService {
    TUser selectById(Long id);

    Integer addUser(TUser user);

    List<TUser> queryList(TUser user);
}
