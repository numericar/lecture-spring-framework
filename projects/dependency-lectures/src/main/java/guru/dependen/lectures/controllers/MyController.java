package guru.dependen.lectures.controllers;

import org.springframework.stereotype.Controller;

import guru.dependen.lectures.services.GreetingService;
import guru.dependen.lectures.services.GreetingServiceImpl;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the MyController class");

        return this.greetingService.sayGreeting();
    }
}
