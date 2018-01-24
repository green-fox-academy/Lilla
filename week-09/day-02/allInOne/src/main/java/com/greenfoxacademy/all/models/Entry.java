package com.greenfoxacademy.all.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Entry {

  private List <Log> entries;

  @JsonProperty("entry_count")
  private Integer EntryCount;


  public Entry() {
  }

  public Entry(List<Log> entries, Integer entryCount) {
    this.entries = entries;
    EntryCount = entryCount;
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public Integer getEntryCount() {
    return EntryCount;
  }

  public void setEntryCount(Integer entryCount) {
    EntryCount = entryCount;
  }
}
