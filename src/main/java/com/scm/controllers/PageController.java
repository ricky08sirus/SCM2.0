package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {
    
    @RequestMapping("/home")//whichever attribute will be added to it it will automatically be added to template
    public String home(Model model) {
        System.out.println("Home page Handler");//error either template is not there or not acessible 
        model.addAttribute("name","substring technology");
        model.addAttribute("YoutubeChannel", "make the world ");
        model.addAttribute("GithubRepository", "ricky08sirus");
        return "home";
    }


}
