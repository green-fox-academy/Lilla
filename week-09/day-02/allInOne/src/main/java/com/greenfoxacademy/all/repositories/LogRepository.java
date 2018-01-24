package com.greenfoxacademy.all.repositories;

import com.greenfoxacademy.all.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository <Log, Integer> {
}
