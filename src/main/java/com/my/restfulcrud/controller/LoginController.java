package com.my.restfulcrud.controller;

import com.my.restfulcrud.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RequestMapping("/user")
@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map, HttpSession session){
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            session.setAttribute("loginUser", username);
            return "redirect:/main";
        }else {
            throw new UserNotExistException();
        }
    }

    @ResponseBody
    @RequestMapping("/hey")
    public String hello(@RequestParam("user") String user){
        System.out.println("user:" + user);
        if (user.equals("my")){
            throw new UserNotExistException();
        }
        return "Hello World";
    }
}
