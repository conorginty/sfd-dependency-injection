package guruspringframework.sfgdi;

import guruspringframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {
	// SpringApplication.run() returns back an Application context
	public static void main(String[] args) {
		// Grab our "Bean" (i.e. the Controller) from the Spring Context - this is Inversion of Control
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		// We can ask this context that we've stored for an instance of my Controller
		// Option 1;
		MyController myController = context.getBean(MyController.class);
		// Option 2;
//		MyController myController = (MyController) context.getBean("myController");

		String greeting = myController.sayHello(); // Hello world!!!
		System.out.println(greeting); // Hi, Folks!
	}

}
