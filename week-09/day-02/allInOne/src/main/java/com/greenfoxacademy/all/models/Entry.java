package com.greenfoxacademy.all.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Entry {

  private List <Log> entries = new ArrayList<>();
  @JsonProperty("entry_count")
  private Integer entryCount;


  public Entry() {
  }

  public Entry(List<Log> entries, Integer entryCount) {
    this.entries = entries;
    this.entryCount = entryCount;
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public Integer getEntryCount() {
    return entryCount;
  }

  public void setEntryCount(Integer entryCount) {
    this.entryCount = entryCount + 1;
  }
}
