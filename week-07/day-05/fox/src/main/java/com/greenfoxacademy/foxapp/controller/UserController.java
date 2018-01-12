package com.greenfoxacademy.foxapp.controller;

import com.greenfoxacademy.foxapp.model.Fox;
import com.greenfoxacademy.foxapp.service.FoxHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

  FoxHandler foxHandling;

  @Autowired
  public UserController(FoxHandler foxHandling) {
    this.foxHandling = foxHandling;
  }

  @GetMapping("/main/{petName}")
  public String showUserPage(Model model, @PathVariable String petName) {
    Fox pet = foxHandling.findFox(petName);
    model.addAttribute("name", petName);
    return "index";
  }
}
