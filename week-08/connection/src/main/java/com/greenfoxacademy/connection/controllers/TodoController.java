package com.greenfoxacademy.connection.controllers;

import com.greenfoxacademy.connection.models.Todo;
import com.greenfoxacademy.connection.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping({"/", "/list"})
  public String list(Model model) {
    List<Todo> todos = (List<Todo>) todoRepository.findAll();
    model.addAttribute("todos", todos);
    return "todo";
  }

  @GetMapping("/active")
  public String showActive(Model model) {
    List<Todo> active = new ArrayList<>();
    List<Todo> todos = (List<Todo>) todoRepository.findAll();
    for (Todo todo : todos) {
      if (todo.isDone() == false) {
        active.add(todo);
      }
    }
    model.addAttribute("todos", active);
    return "todo";
  }
}
