package com.greenfoxacademy.all.controllers;

import com.greenfoxacademy.all.models.*;
import com.greenfoxacademy.all.models.Error;
import com.greenfoxacademy.all.models.array.Multiply;
import com.greenfoxacademy.all.models.array.PostArray;
import com.greenfoxacademy.all.models.array.SumArray;
import com.greenfoxacademy.all.models.camellzer.Hun;
import com.greenfoxacademy.all.models.camellzer.Teve;
import com.greenfoxacademy.all.models.starWars.Human;
import com.greenfoxacademy.all.models.starWars.Sith;
import com.greenfoxacademy.all.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainRestController {

  @Autowired
  LogService logService;
  @Autowired
  Entry entry;


  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if(input != null) {
      Log log = new Log("/doubling", "input=" + input);
      logService.save(log);
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
      logService.save(log);
      return new Welcome(studentName, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object append(@PathVariable String appendable) {
    if(appendable == null) {
      return new Error("404");
    } else {
      Log log = new Log("/appenda/{appendable}", "appendable=" + appendable);
      logService.save(log);
      return new AppendA(appendable);
    }
  }

  @PostMapping("/dountil/{what}")
  public Object doUntil(@PathVariable String what, @RequestBody (required = false) DoUntilValue doUntilValue) {
    Log log = new Log("/dountil/{what}", "value=" + doUntilValue.getUntil().toString());
    logService.save(log);
    if (doUntilValue == null) {
      return new Error("Please provide a number!");
    } else if ( what.equals("sum") || what.equals("factor")) {
      return new DoUntil(doUntilValue.getUntil(), what);
    } else {
      return new Error("No param");
    }
  }

  @PostMapping ("/arrays")
  public Object arrayHandle(@RequestBody (required = false) PostArray postArray) {
    Log log = new Log("/arrays/{what}", "what=" + postArray.getWhat() + "value=" + postArray.getNumbers().toString());
    logService.save(log);
    if (postArray == null) {
      return new Error("Please provide what to do with the numbers!");
    } else if (postArray.getWhat().equals("sum")) {
      return new SumArray(postArray.getNumbers());
    } else if (postArray.getWhat().equals("multiply")) {
      return new Multiply(postArray.getNumbers());
    } else if (postArray.getWhat().equals("double")) {
      return new Double(String.valueOf(postArray.getNumbers()));
    } return new Error("Please provide what to do with the numbers!");
  }

  @GetMapping ("/log")
  public Object getLogs() {
    List<Log> allEntry = logService.findAll();
    return new Entry(allEntry,allEntry.size());
  }

  @PostMapping ("/sith")
  public Object speakAsASith(@RequestBody (required = false) Human human) {
    if (human == null) {
      return new Error("Nothing is provided!");
    } else if (human.getText() != null) {
      return new Sith(human);
    }
    return new Error( "Feed me some text you have to, padawan young you are. Hmmm.");
  }

  @PostMapping("/translate")
  public Object camellzerService(@RequestBody (required = false) Hun hungarian) {
    if(hungarian == null) {
      return  new Error("No input");
    } else if (hungarian.getText() != null && hungarian.getLang().equals("hu")) {
      return new Teve(hungarian);
    } return new Error("I can't translate that!");
  }
}
