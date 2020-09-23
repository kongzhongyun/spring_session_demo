package com.offcn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FifthController {
    @GetMapping("fifth")
    public String indexPage(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");
        return "index5";
    }
}
