package com.greenfoxacademy.springintro.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  private AtomicLong countClick = new AtomicLong(0);
  @RequestMapping
  public Greeting greeting( @RequestParam(value = "name", required = false) String name) {
    Greeting ciao = new Greeting(countClick.getAndIncrement(),"Hello, " + name + " !");
    return ciao;
    }
}
