package guru.dependen.lectures;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import guru.dependen.lectures.controllers.MyController;

@SpringBootTest
class LecturesApplicationTests {

	@Autowired // เป็นการ inject คลาส ApplicationContext ที่ถูกสร้างขึ้นมาให้เรา โดย Spring Boot ซึ่ง object จะถูกเก็บอยู่ใน bean
	ApplicationContext applicationContext;

	@Test
	void testGetControllerFromCtx() {
		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
