package com.example.demoProject.login;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {


    @GetMapping("/login")
   public String loginForm(){


       return  "login";
   }



    @PostMapping("/login")
    public String login(@RequestParam(name = "id") String id ,
                        @RequestParam(name = "pw")String pw){

        System.out.println( id  +  pw  +"success");

        return  "redirect:/home";
    }
}
