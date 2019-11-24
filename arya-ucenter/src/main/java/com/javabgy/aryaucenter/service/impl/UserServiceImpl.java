package com.javabgy.aryaucenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javabgy.aryaucenter.mapper.UserMapper;
import com.javabgy.aryaucenter.domain.UserPO;
import com.javabgy.aryaucenter.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author Gary
 * @className UserServiceImpl
 * @description TODO
 * @date 2019/11/24 18:46
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserPO> implements IUserService {
}
