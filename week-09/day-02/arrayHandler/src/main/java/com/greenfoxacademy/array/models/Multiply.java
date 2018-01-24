package com.greenfoxacademy.array.models;

public class Multiply {

  private Integer result = 1;

  public Multiply() {
  }

  public Multiply(Integer result) {
    this.result = result;
  }

  public Multiply(int numbers[]) {
    for (int i = 0; i < numbers.length ; i++) {
      result = getResult() * numbers[i];
    }
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
