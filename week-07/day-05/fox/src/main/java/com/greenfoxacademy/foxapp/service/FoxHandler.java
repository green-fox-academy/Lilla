package com.greenfoxacademy.foxapp.service;
import com.greenfoxacademy.foxapp.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxHandler {

  private List <Fox> foxes;

  public FoxHandler() {
    foxes = new ArrayList<>();
  }

  public Fox login(Fox fox) {
    if (!foxes.contains(fox)) {
      foxes.add(fox);
      return fox;
    }
    return fox;
  }

  public Fox findFox(String petName) {
    for (Fox pet : foxes) {
      if (pet.getName().equals(petName)) {
        return pet;
      }
    }
    Fox pet = new Fox();
    pet.setName(petName);
    foxes.add(pet);
    return pet;
  }

  public void addFox(Fox pet) {
    foxes.add(pet);
  }
}
