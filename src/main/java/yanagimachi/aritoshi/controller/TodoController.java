package yanagimachi.aritoshi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
