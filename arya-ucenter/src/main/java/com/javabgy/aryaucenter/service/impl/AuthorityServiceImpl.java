package com.javabgy.aryaucenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javabgy.aryaucenter.mapper.AuthorityMapper;
import com.javabgy.aryaucenter.domain.AuthorityPO;
import com.javabgy.aryaucenter.service.IAuthorityService;
import org.springframework.stereotype.Service;

/**
 * @author Gary
 * @className AuthorityServiceImpl
 * @description TODO
 * @date 2019/11/24 18:48
 **/
@Service
public class AuthorityServiceImpl extends ServiceImpl<AuthorityMapper, AuthorityPO> implements IAuthorityService {
}
