package com.greenfoxacademy.all.models;

import org.springframework.stereotype.Component;

@Component
public class Doubling {

  public int received;
  public int result;


  public Doubling() {
  }

  public Doubling(Integer input) {
    received = input;
    result = input * 2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}

