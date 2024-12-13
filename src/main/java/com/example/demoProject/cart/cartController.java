package com.example.demoProject.cart;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class cartController {

    @GetMapping("/cart")
    public String cart (  Model model){


        ArrayList<String> list = new ArrayList<>();
        list.add("패딩");
        list.add("신발");


        model.addAttribute("list", list);


        return "/cart";
    }
}
