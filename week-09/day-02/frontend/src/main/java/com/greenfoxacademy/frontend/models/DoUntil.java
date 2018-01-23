package com.greenfoxacademy.frontend.models;


public class DoUntil {

  private Integer result;

  public DoUntil() {
  }

  public DoUntil(Integer input ,String what) {
    if (what.equals("sum")) {
      result = sum(input);
    } else if (what.equals("factor")) {
      result = factor(input);
    } else {
      result = 0;
    }
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public Integer sum(Integer until) {
    if (until == 0) {
      return 0;
    } else {
      return until + sum(until - 1);
    }
  }

  public Integer factor(Integer until) {
    if (until == 0) {
      return 0;
    } else {
      return until * factor(until - 1);
    }
  }
}
