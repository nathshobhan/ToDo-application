package com.shobhan4java.Todo.controller;

import com.shobhan4java.Todo.model.TodoItem;
import com.shobhan4java.Todo.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {
    @Autowired
    private TodoRepo todoRepo;

    @GetMapping
    public List<TodoItem> findAll(){
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoItem save(@Valid @NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }

    @PutMapping
    public TodoItem update(@Valid @NotNull @RequestBody TodoItem todoItem)
    {
        return todoRepo.save(todoItem);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id){
        todoRepo.deleteById(id);
    }
}
