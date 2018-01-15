package com.greenfoxacademy.connection.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  protected int id;
  private String title;
  private boolean isDone;
  private boolean isUrgent;


  public Todo() {
    isUrgent = false;
    isDone = false;
  }

  public Todo(String title) {
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }

  public Todo(String title, boolean isDone, boolean isUrgent) {
    this.title = title;
    this.isDone = isDone;
    this.isUrgent = isUrgent;

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean done) {
    isDone = done;
  }
}
