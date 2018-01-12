package com.greenfoxacademy.foxapp.controller;

import com.greenfoxacademy.foxapp.model.Fox;
import com.greenfoxacademy.foxapp.service.FoxHandler;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

  FoxHandler foxHandling;

  @Autowired
  public LoginController(FoxHandler foxHandling) {
    this.foxHandling = foxHandling;
  }

  @GetMapping("/login")
  public String showLogin(Model model) {
    model.addAttribute("petName", new Fox());
    return "login";
  }

  @PostMapping("/login")
  private ModelAndView handleLogin(Model model, @ModelAttribute Fox pet, @RequestParam(value = "name", required = false) String petName) {
    Fox loggedInPet = foxHandling.login(pet);
    model.addAttribute("petName", loggedInPet);
    if (petName.equals("")) {
      return  new ModelAndView("redirect:/login");
    }
    return new ModelAndView("redirect:/main/" + petName);
  }
}
