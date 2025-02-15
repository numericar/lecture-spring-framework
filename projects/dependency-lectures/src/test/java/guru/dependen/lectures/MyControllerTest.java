package guru.dependen.lectures;

import org.junit.jupiter.api.Test;

import guru.dependen.lectures.controllers.MyController;

public class MyControllerTest {
    
    @Test
    void sayHello() {
        MyController myController = new MyController();
        System.out.println(myController.sayHello());
    }
}
