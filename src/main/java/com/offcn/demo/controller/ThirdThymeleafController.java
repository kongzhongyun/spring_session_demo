package com.offcn.demo.controller;

import com.offcn.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ThirdThymeleafController {
    @GetMapping("/third")
    public  String indexPage(Model model){
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User(2, "yun", 23);
        User u2 = new User(3, "hai", 25);
        list.add(u1);
        list.add(u2);
        model.addAttribute("userList",list);
        return "index3";
    }

}
