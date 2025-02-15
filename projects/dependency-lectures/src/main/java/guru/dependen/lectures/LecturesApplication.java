package guru.dependen.lectures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.dependen.lectures.controllers.MyController;

@SpringBootApplication
public class LecturesApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(LecturesApplication.class, args);

		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println("In main method");
		System.out.println(myController.sayHello());
	}

}
