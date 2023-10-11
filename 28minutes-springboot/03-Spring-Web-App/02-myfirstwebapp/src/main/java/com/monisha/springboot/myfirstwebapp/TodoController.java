package com.monisha.springboot.myfirstwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("nameused")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService=todoService;
    }

    //url : list-todos
    @RequestMapping("list-todos")
    public String gotolisttodo(ModelMap model){
        List<Todo> todos =todoService.findByUsername("monisha");
        model.put("listtodos",todos);
        return "listTodos";
    }
}
