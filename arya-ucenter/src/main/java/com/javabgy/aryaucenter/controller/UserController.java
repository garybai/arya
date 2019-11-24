package com.javabgy.aryaucenter.controller;

import com.javabgy.aryaucenter.domain.UserPO;
import com.javabgy.aryaucenter.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Gary
 * @className UserController
 * @description TODO
 * @date 2019/11/24 21:14
 **/
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/user/list")
    public List<UserPO> listAllUsers(){
        return userService.list();
    }

    @PostMapping("/user/add")
    public Boolean addUser(@Valid @RequestBody UserPO userPO, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            String defaultMessage = bindingResult.getFieldError().getDefaultMessage();
            System.out.println(defaultMessage);
            return false;
        }
        return userService.save(userPO);
    }

}
