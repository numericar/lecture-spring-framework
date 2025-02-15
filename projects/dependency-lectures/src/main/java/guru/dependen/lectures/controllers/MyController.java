package guru.dependen.lectures.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("I'm in the MyController class");
        
        return "Hello World!";
    }
}
