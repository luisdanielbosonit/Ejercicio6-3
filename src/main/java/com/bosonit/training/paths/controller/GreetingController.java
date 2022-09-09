package com.bosonit.training.paths.controller;

import com.bosonit.training.paths.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/path")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private static final String template2 = "El nombre es, %s";

    private static final String template3 = "La ciudad es, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @PutMapping("/object")
    public User user(@RequestParam(value = "name", defaultValue = "Daniella")String name, @RequestParam(value = "city",defaultValue = "sevilla")String city){
        return new User(counter.incrementAndGet(),String.format(template2, name), String.format(template3, city), "luisubfe@oown" );
    }

    @PostMapping("/post")
    public User user(@RequestBody User user){
        return user;
    }

    @GetMapping("/user/{id}")
    public User userId(@PathVariable long id){
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "antonio", "Madrid", "antonio.madrid@bosonit.com"));
        userList.add(new User(2, "antonio", "Madrid", "antonio.madrid@bosonit.com"));
        userList.add(new User(3, "antonio", "Madrid", "antonio.madrid@bosonit.com"));

        for (User task: userList){
            if (task.getId()==(id)){
                return task;
            }
        }
        return null;
    }


}







