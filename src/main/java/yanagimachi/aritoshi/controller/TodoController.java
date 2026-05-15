package yanagimachi.aritoshi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import yanagimachi.aritoshi.entity.Todo;
import yanagimachi.aritoshi.repository.TodoRepository;

@Controller
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/")
    public String index(Model model) {

        List<Todo> todos = todoRepository.findAll();
        model.addAttribute("todos", todos);

        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoRepository.deleteById(id);

        return "redirect:/";
    }

    @PostMapping("/add")
    public String addTodo(String task) {
        Todo todo = new Todo();

        todo.setTask(task);

        todoRepository.save(todo);

        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editTodo(@PathVariable Long id, Model model) {

        Todo todo = todoRepository.findById(id).orElse(null);

        model.addAttribute("todo", todo);

        return "edit";
    }

    @PostMapping("/update")
    public String updateTodo(Todo todo) {
        todoRepository.save(todo);

        return "redirect:/";
    }
}
