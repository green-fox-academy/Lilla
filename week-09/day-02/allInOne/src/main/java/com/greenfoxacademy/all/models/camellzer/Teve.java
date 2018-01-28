package com.greenfoxacademy.all.models.camellzer;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teve {

  private String translated;
  private String lang = "teve";
  @JsonIgnore
  List<Character> vowels = Arrays.asList('a', 'á', 'e', 'é', 'i', 'í', 'o', 'ó', 'ö', 'ő', 'u', 'ú', 'ü', 'ű',
          'A', 'Á', 'E', 'É', 'I', 'Í', 'O', 'Ó', 'Ö', 'Ő', 'U', 'Ú', 'Ü', 'Ű');

  public Teve() {
  }

  public Teve(Hun hungarian) {
    String[] normalWordsArray = hungarian.getText().split("\\s+");
    makeString(makeATeveCharArray(normalWordsArray));
  }



  public  List<String> makeATeveCharArray(String[] normalWordsArray) {
    List<String> teveWordsList = new ArrayList<>();
    for (int i = 0; i < normalWordsArray.length; i++) {
      List<Character> teveWordsCharList = new ArrayList<>();
      for (int j = 0; j < normalWordsArray[i].length(); j++) {
        teveWordsCharList.add(normalWordsArray[i].charAt(j));
        if (vowels.contains(normalWordsArray[i].charAt(j))) {
          teveWordsCharList.addAll(Arrays.asList('v', normalWordsArray[i].charAt(j)));
        }
      }
      String translatedWord = String.valueOf(teveWordsCharList);
      teveWordsList.add(translatedWord);
    }
    return teveWordsList;
  }

  private void makeString(List <String> list) {
    translated = list.stream().collect(Collectors.joining(" "));
  }


  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }

  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }
}
