package com.greenfoxacademy.listing.controllers;

import com.greenfoxacademy.listing.models.Todo;
import com.greenfoxacademy.listing.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping("/todo")
  public String showTodo() {
    return "todo";
  }

  @GetMapping({"/", "/list"})
  public String list(Model model) {
    List<Todo> todos = (List<Todo>) todoRepository.findAll();
    model.addAttribute("todos", todos);
    return "list";
  }
}
