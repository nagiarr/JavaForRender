package yanagimachi.aritoshi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import yanagimachi.aritoshi.entity.Todo;
import yanagimachi.aritoshi.repository.TodoRepository;

@RestController
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/add")
    public String addTodo() {

        Todo todo = new Todo();
        todo.setTask("Spring Boot勉強");

        todoRepository.save(todo);

        return "Todo Saved";
    }
}
