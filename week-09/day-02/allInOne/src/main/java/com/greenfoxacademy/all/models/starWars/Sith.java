package com.greenfoxacademy.all.models.starWars;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;


public class Sith {


  @JsonProperty("sith_text")
  private String sithText;
  @JsonIgnore
  Random rand = new Random();

  public Sith() {
  }

  public Sith(Human human) {
    String humanSentence = human.getText();
    humanSentence.toLowerCase(); // ez nem műkszik
    String[] words = humanSentence.split("\\s+");
    switchWords(words);
    addHmm(words);
    setSithText(words);
  }



  public String[] switchWords(String[] words) {

    for (int i = 0; i < words.length; i += 2) {
      if (!(words[i].endsWith(".") || words[i + 1].endsWith("."))) {
        String temp = words[i];
        words[i] = words[i + 1];
        words[i + 1] = temp;
      }
    }
    return words;
  }

  public String[] addHmm(String[] words) {
    for (int i = 0; i < words.length; i++) {
      int randomNumber = rand.nextInt(3);
      if (words[i].endsWith(".")) {
        if (randomNumber == 3) {
          words[i] = words[i] + " Arrgh. Uhmm. ";
        } else if (randomNumber == 2) {
          words[i] = words[i] + " Err..err.err. ";
        } else {
          words[i] = words[i] + " Hmmm. ";
        }
      }
    } return words;
  }


  public String getSithText() {
    return sithText;
  }

  public void setSithText(String[] words) {
    String sithSentence = Arrays.stream(words).collect(Collectors.joining(" "));
    sithText = sithSentence;
  }
}
