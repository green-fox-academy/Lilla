package com.greenfoxacademy.all.controllers;

import com.greenfoxacademy.all.models.*;
import com.greenfoxacademy.all.models.Error;
import com.greenfoxacademy.all.services.LogServicw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  @Autowired
  LogServicw logServicw;


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
      Log log = new Log("/greeter", "name=" + studentName + ", title=" + title);
      logServicw.save(log);
      return new Welcome(studentName, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object append(@PathVariable String appendable) {
    if(appendable == null) {
      return new Error("404");
    } else {
      Log log = new Log("/appenda/{appendable}", "appendable=" + appendable);
      logServicw.save(log);
      return new AppendA(appendable);
    }
  }

  @PostMapping("/dountil/{what}")
  public Object doUntil(@PathVariable String what, @RequestBody (required = false) DoUntilValue doUntilValue) {
    if (doUntilValue == null) {
      return new Error("Please provide a number!");
    } else if ( what.equals("sum") || what.equals("factor")) {
      return new DoUntil(doUntilValue.getUntil(), what);
    } else {
      return new Error("No param");
    }
  }
}
