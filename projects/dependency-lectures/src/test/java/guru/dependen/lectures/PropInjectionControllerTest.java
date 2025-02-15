package guru.dependen.lectures;

import org.junit.jupiter.api.Test;

import guru.dependen.lectures.controllers.PropInjectionController;
import guru.dependen.lectures.services.GreetingServiceImpl;

public class PropInjectionControllerTest {
    

    @Test
    void sayHello() {
        PropInjectionController propInjectionController = new PropInjectionController();
        propInjectionController.greetingService = new GreetingServiceImpl();
        
        System.out.println(propInjectionController.sayHello());
    }

}
