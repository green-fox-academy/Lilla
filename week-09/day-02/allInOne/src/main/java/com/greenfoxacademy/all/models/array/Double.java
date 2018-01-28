package com.greenfoxacademy.all.models.array;

import java.util.ArrayList;
import java.util.List;

public class Double {

  private List<Integer> result = new ArrayList();

  public Double() {
  }

  public Double(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      result.add(numbers[i] * 2);
    }
  }

  public List<Integer> getResult() {
    return result;
  }

  public void setResult(List<Integer> result) {
    this.result = result;
  }
}
