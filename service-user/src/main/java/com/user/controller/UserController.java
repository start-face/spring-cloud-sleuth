package com.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FaceFeel
 * @Created 2018-05-31 13:50
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/hi")
    public String hi(){
        return "Hi! I'm Service-User !";
    }
}
