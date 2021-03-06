package guru.springframework.sfgdi;

import guru.springframework.sfgdi.config.SfgConfiguration;
import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.services.PrototypeBean;
import guru.springframework.sfgdi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {
	// SpringApplication.run() returns back an Application context
	public static void main(String[] args) {
		// Grab our "Bean" (i.e. the Controller) from the Spring Context - this is Inversion of Control
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

//		PetController petController = context.getBean(PetController.class);
//		System.out.println(petController.getBestPet());
//
//		I18nController i18nController = context.getBean(I18nController.class);
//		System.out.println(i18nController.sayHello());
//
//		System.out.println("=== MyController - Primary Bean ===");
//		// We can ask this context that we've stored for an instance of my Controller
//		MyController myController = context.getBean(MyController.class);
//		System.out.println(myController.sayHello());
//
//		System.out.println("=== Property-Injected Controller ===");
//		PropertyInjectedController propertyInjectedController = context.getBean(PropertyInjectedController.class);
//		System.out.println(propertyInjectedController.getGreeting());
//
//		System.out.println("=== Setter-Injected Controller ===");
//		SetterInjectedController setterInjectedController = context.getBean(SetterInjectedController.class);
//		System.out.println(setterInjectedController.getGreeting());
//
//		System.out.println("=== Constructor-Injected Controller ===");
//		ConstructorInjectedController constructorInjectedController = context.getBean(ConstructorInjectedController.class);
//		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("=== Bean Scopes ===");
		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		System.out.println(singletonBean2.getMyScope());

		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		System.out.println(prototypeBean2.getMyScope());

		System.out.println("=== Fake Datasource ===");
		FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcUrl());

		System.out.println("=== Config Props Bean ===");
		SfgConfiguration sfgConfiguration = context.getBean(SfgConfiguration.class);
		System.out.println(sfgConfiguration.getUsername());
		System.out.println(sfgConfiguration.getPassword());
		System.out.println(sfgConfiguration.getJdbcUrl());

		System.out.println("=== Constructor Binding ===");
		SfgConfiguration sfgConstructorConfig = context.getBean(SfgConfiguration.class);
		System.out.println(sfgConstructorConfig.getUsername());
		System.out.println(sfgConstructorConfig.getPassword());
		System.out.println(sfgConstructorConfig.getJdbcUrl());
	}

}
