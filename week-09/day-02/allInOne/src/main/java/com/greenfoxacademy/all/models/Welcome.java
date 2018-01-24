package com.greenfoxacademy.all.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Welcome {

  @JsonIgnore
  private String name;

  @JsonIgnore
  private String title;

  @JsonProperty("welcome_message")
  private String welcomeMessage;

  public Welcome() {
  }

  public Welcome(String name, String title) {
    this.name = name;
    this.title = title;
    welcomeMessage = "Oh, hi there " + name + ", my dear " + title + "!";
  }
}
