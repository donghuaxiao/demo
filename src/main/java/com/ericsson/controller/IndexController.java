package com.ericsson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xdhua on 2017/6/11.
 */
@Controller
public class IndexController {

    @RequestMapping(value="/index")
    public String index(Model model) {
        model.addAttribute("name", "donghua");
        return "index";
    }
}
