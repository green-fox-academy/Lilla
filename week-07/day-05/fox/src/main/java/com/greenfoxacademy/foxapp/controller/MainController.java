package com.greenfoxacademy.foxapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @RequestMapping("/main")
  public String showMainPage(Model model, @RequestParam(value = "name", required = false) String petName) {
    model.addAttribute("name", petName);
    return "index";
  }
}
