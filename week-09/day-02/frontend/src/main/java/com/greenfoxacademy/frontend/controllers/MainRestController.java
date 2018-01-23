package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Doubling;
import com.greenfoxacademy.frontend.models.Error;
import com.greenfoxacademy.frontend.models.Welcome;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if(input != null) {
      return new Doubling(input);
    } else {
      return new Error("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  public Object doubling(@RequestParam(value = "name", required = false) String studentName,
                         @RequestParam(value = "title", required = false) String title) {
    if(studentName == null) {
      return new Error("Please provide a name!");
    } else if (title == null) {
      return new Error("Please provide a title!");
    } else {
      return new Welcome("Oh, hi there " + studentName + ", my dear " + title + "!");
    }
  }
}
