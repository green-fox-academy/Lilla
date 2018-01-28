package com.greenfoxacademy.all.models.camellzer;

public class Hun {

  private String text;
  private String lang;

  public Hun() {
  }

  public Hun(String text, String lang) {
    this.text = text;
    this.lang = lang;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }
}
