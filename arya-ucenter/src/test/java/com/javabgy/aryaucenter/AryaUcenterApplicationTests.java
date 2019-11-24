package com.javabgy.aryaucenter;

import com.javabgy.aryaucenter.domain.AuthorityPO;
import com.javabgy.aryaucenter.domain.RolePO;
import com.javabgy.aryaucenter.domain.UserPO;
import com.javabgy.aryaucenter.service.IAuthorityService;
import com.javabgy.aryaucenter.service.IRoleService;
import com.javabgy.aryaucenter.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AryaUcenterApplicationTests {

    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IAuthorityService authorityService;

    @Test
    public void contextLoads() {
        List<UserPO> list = userService.list();
        list.forEach(System.out::println);
        List<RolePO> list1 = roleService.list();
        list1.forEach(System.out::println);
        List<AuthorityPO> list2 = authorityService.list();
        list2.forEach(System.out::println);
    }

}
