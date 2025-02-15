package guru.dependen.lectures.controllers;

import guru.dependen.lectures.services.GreetingService;

public class PropInjectionController {
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
