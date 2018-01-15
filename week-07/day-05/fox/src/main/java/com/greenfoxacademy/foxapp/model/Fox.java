package com.greenfoxacademy.foxapp.model;

import java.util.List;

public class Fox {

  private String name;
  private String food;
  private String drink;
//  private List<Tricks> tricks;



  public Fox() {
    name = "Mr Green";
  }

  public Fox(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
