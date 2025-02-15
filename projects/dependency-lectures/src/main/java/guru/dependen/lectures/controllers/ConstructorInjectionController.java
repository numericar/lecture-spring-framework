package guru.dependen.lectures.controllers;

import org.springframework.stereotype.Controller;

import guru.dependen.lectures.services.GreetingService;

@Controller
public class ConstructorInjectionController {
    private final GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
