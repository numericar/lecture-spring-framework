package guru.dependen.lectures.controllers;

import guru.dependen.lectures.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingsService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
