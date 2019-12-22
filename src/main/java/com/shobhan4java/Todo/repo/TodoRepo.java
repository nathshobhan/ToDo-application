package com.shobhan4java.Todo.repo;

import com.shobhan4java.Todo.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {
}
