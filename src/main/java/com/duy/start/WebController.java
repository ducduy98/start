package com.duy.start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller

public class WebController {
//    @GetMapping("/")
//    public String index(){
//        return "index";
//    }

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "ten",required = false,defaultValue = "") String name, Model model){

        model.addAttribute("ten",name);

        return "hello";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }



    @GetMapping("/profile")
    public String profile(Model model){
        // Tạo ra thông tin
        List<Info> profile = new ArrayList<>();
        profile.add(new Info("fullname", "Nguyễn Hoàng Nam"));
        profile.add(new Info("nickname", "gfd"));
        profile.add(new Info("gmail", "loda.namnh@gmail.com"));
        profile.add(new Info("facebook", "https://www.facebook.com/nam.tehee"));
        profile.add(new Info("website", "https://loda.me"));

//         Đưa thông tin vào Model
        model.addAttribute("duyProfile", profile);

        // TRả về template profile.html
        return "profile";
    }





    List<Todo> todoList=new CopyOnWriteArrayList<>();

    @GetMapping("/listTodo")
    public String index(Model model,@RequestParam(value = "limit",required = false)Integer limit){
        model.addAttribute("todoList",limit!=null ? todoList.subList(0,limit) : todoList);
        return "listTodo";
    }

    @GetMapping("/addTodo")
    public String addTodo(Model model){
        model.addAttribute("todo",new Todo());
        return "addTodo";
    }

    @PostMapping("/addTodo")
    public String addTodo(@ModelAttribute Todo todo) {
        todoList.add(todo);
        return "success";
    }
}
