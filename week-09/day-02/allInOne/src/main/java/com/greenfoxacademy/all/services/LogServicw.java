package com.greenfoxacademy.all.services;


import com.greenfoxacademy.all.models.Log;
import com.greenfoxacademy.all.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServicw {

  @Autowired
  LogRepository logRepository;

  public void save(Log log) {
    logRepository.save(log);
  }
}
