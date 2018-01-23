package com.greenfoxacademy.frontend.models;

public class Welcome {

  private String welcome_message;

  public Welcome() {
  }

  public Welcome(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
