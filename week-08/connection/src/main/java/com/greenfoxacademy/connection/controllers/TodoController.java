package com.greenfoxacademy.connection.controllers;

import com.greenfoxacademy.connection.models.Todo;
import com.greenfoxacademy.connection.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
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

  @RequestMapping(value = "/list", params = {"delete"})
  public String delete(final HttpServletRequest request) {
    final Integer index = Integer.valueOf(request.getParameter("delete"));
    Todo todo = todoRepository.findOne(index);
    todoRepository.delete(todo.getId());
    return "redirect:list";
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

  @GetMapping("/add")
  public String add(Model model) {
    model.addAttribute("newTodo", new Todo());
    return "add";
  }

  @PostMapping("/todo/create")
  public String createNewTodo(Todo todo) {
    todoRepository.save(todo);
    return "redirect:/list";
  }

  //todo edithet kapcsolódik

  @GetMapping("{id}/edit")
  public String edit(Model model, @PathVariable int id) {
    Todo todo = todoRepository.findOne(id);
    model.addAttribute("todo", todo);
    return "edit";
  }

  @PostMapping("/edit/todo")
  public String createUpdate(Todo todo) {
    todoRepository.save(todo);
    return "redirect:/list";
  }
}
