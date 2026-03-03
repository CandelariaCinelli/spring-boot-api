package com.luv2code.springboot.todos.service;

;
import com.luv2code.springboot.todos.request.TodoRequest;
import com.luv2code.springboot.todos.response.TodoResponse;

import java.util.List;
import java.util.Optional;

public interface TodoService {

    List<TodoResponse> getAllTodos();

    TodoResponse createTodo (TodoRequest todoRequest);

    TodoResponse toggleTodoCompletion (Long Id);

    void deleteTodo (long id);

}
