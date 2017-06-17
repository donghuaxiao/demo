package com.ericsson.controller;

import com.ericsson.domain.User;
import com.ericsson.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xdhua on 2017/6/11.
 */
@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value="/user/{id}")
    public String userInfo( @PathVariable("id") Integer id, Model model) {
        User user = null;
        user = userMapper.findById(id);
        model.addAttribute("user", user);
        return "userinfo";
    }
}
