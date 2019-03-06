package com.itsun.web.controller;

import com.itsun.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {



    @GetMapping("/login")
    public String index(User user){
        return "admin-index";
    }




}
