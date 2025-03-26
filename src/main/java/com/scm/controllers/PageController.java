package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// some javascript are required by all pages so ther we can use the fragment 
//fragment is the part of the thymleaf

@Controller
public class PageController {

  @RequestMapping("/home") // whichever attribute will be added to it it will automatically be added to
                           // template
  public String home(Model model) {
    System.out.println("Home page Handler");// error either template is not there or not acessible
    // sending data to view
    model.addAttribute("name", "substring technology");
    model.addAttribute("YoutubeChannel", "make the world ");
    model.addAttribute("GithubRepository", "https://github.com/ricky08sirus/SCM2.0");
    return "home";
  }

  //about route
  @RequestMapping("/about")
  public String aboutPage(){
    System.out.println("About page Handler");
    return "about";
  }
  //services




}
