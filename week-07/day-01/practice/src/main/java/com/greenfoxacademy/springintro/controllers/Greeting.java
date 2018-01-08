package com.greenfoxacademy.springintro.controllers;

public class Greeting {

  private long ID;

  private String content;

  public long getID() {
    return ID;
  }

  public String getContent() {
    return content;
  }

  public Greeting(long ID, String content) {
    this.ID = ID;
    this.content = content;
  }
}
