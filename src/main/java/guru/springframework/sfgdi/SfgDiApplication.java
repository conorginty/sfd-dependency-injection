package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {
	// SpringApplication.run() returns back an Application context
	public static void main(String[] args) {
		// Grab our "Bean" (i.e. the Controller) from the Spring Context - this is Inversion of Control
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = context.getBean(PetController.class);
		System.out.println(petController.getBestPet());

		I18nController i18nController = context.getBean(I18nController.class);
		System.out.println(i18nController.sayHello());

		System.out.println("=== MyController - Primary Bean ===");
		// We can ask this context that we've stored for an instance of my Controller
		MyController myController = context.getBean(MyController.class);
		System.out.println(myController.sayHello());

		System.out.println("=== Property-Injected Controller ===");
		PropertyInjectedController propertyInjectedController = context.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("=== Setter-Injected Controller ===");
		SetterInjectedController setterInjectedController = context.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("=== Constructor-Injected Controller ===");
		ConstructorInjectedController constructorInjectedController = context.getBean(ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());
	}

}
