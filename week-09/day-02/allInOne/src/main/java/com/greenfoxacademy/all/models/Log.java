package com.greenfoxacademy.all.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private Date createAt;
  private String endPoint;
  private String data;

  public Log() {
  }

  public Log(String endPoint, String data) {
    this.endPoint = endPoint;
    this.data = data;
    createAt = new Date();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }

  public String getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(String endPoint) {
    this.endPoint = endPoint;
  }

  public Object getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}

