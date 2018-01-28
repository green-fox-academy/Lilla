package com.greenfoxacademy.all.services;


import com.greenfoxacademy.all.models.Log;
import com.greenfoxacademy.all.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LogService {

  @Autowired
  LogRepository logRepository;

  public void save(Log log) {
    logRepository.save(log);
  }

  public List <Log> findAll() {
    List <Log> allEntry = (List<Log>) logRepository.findAll();
    return allEntry;
  }
}
