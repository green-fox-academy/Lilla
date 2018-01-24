package com.greenfoxacademy.array.models;


public class SumArray {

  private Integer result = 0;

  public SumArray() {
  }

  public SumArray(int numbers[]) {
    for (int i = 0; i < numbers.length ; i++) {
      result += numbers[i];
    }
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
