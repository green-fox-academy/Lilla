package com.greenfoxacademy.springintro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  private AtomicLong countClick = new AtomicLong(0);
  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name", required = false) String name) {
    countClick.getAndIncrement();
    model.addAttribute("name", name);
    model.addAttribute("count", countClick);
    return "greeting";
  }
}
