package com.greenfoxacademy.listing.repository;
import com.greenfoxacademy.listing.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer> {
}
