package com.greenfoxacademy.array.controllers;

import com.greenfoxacademy.array.models.Double;
import com.greenfoxacademy.array.models.Error;
import com.greenfoxacademy.array.models.Multiply;
import com.greenfoxacademy.array.models.PostArray;
import com.greenfoxacademy.array.models.SumArray;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @PostMapping ("/arrays")
  public Object arrayHandle(@RequestBody (required = false) PostArray postArray) {
    if (postArray == null) {
      return new Error("Please provide what to do with the numbers!");
    } else if (postArray.getWhat().equals("sum")) {
      return new SumArray(postArray.getNumbers());
    } else if (postArray.getWhat().equals("multiply")) {
      return new Multiply(postArray.getNumbers());
    } else if (postArray.getWhat().equals("double")) {
      return new Double(postArray.getNumbers());
    } return new Error("Please provide numbers!");
  }
}
