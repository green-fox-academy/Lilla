package com.greenfoxacademy.foxapp.controller;

import com.greenfoxacademy.foxapp.model.Food;
import com.greenfoxacademy.foxapp.model.Fox;
import com.greenfoxacademy.foxapp.service.FoxHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class NutritionController {

  FoxHandler foxHandling;

  ArrayList <Food> foods = new ArrayList<>(Arrays.asList(
          new Food("Salad"),
          new Food("Pizza"),
          new Food("Burger"),
          new Food("Cereal"),
          new Food("Lasagne"),
          new Food("Croissant"),
          new Food("Boeuf Bourguignon")));

  @Autowired
  public NutritionController(FoxHandler foxHandling) {
    this.foxHandling = foxHandling;
  }

  @RequestMapping(value = "/nutritionStore/{petName}", params = {"raiseBalance"})
  public String getFood(Model model, @PathVariable String petName, final HttpServletRequest request) {
    final Integer foodIndex = Integer.valueOf(request.getParameter("raiseBalance"));
    Fox pet = foxHandling.findFox(petName);
    //model.addAttribute("snack", pet.setFood());
    model.addAttribute("foods", foods);
    return "redirect:main/" + petName;
  }

}
