package com.greenfoxacademy.all.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String show() {
    return "index";
  }
}

