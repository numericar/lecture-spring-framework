package guru.dependen.lectures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.dependen.lectures.controllers.SetterInjectedController;
import guru.dependen.lectures.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;
    
    @BeforeEach
    void setUp() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingsService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}
