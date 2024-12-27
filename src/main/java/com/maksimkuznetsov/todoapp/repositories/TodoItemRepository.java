package com.maksimkuznetsov.todoapp.repositories;

import com.maksimkuznetsov.todoapp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
}
