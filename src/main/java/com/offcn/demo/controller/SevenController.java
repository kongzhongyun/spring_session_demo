package com.offcn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class SevenController {
    @GetMapping("/seven")
    public String SevenThymeleafController(Model model){
        Date date = new Date();
        model.addAttribute("date",date);


        double price = 128.123;
        model.addAttribute("price",price);
        String str="道可道，非常道。名可名，非常名。\r\n无名，天地之始。有名，万物之母。\r\n故常无欲以观其妙；常有欲以观其徼。\r\n此两者同出而异名，同谓之玄。玄之又玄，众妙之门。";
        model.addAttribute("strText",str);

        String str2="JAVA-offcn";
        model.addAttribute("str2",str2);
        return "index7";
    }
}
