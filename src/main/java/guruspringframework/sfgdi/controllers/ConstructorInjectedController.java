package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// BEST way to do Dependency Injection...
@Controller
public class ConstructorInjectedController {
    // N.B. - @Autowired is NOT REQUIRED for a Constructor-based implementation
    private final GreetingService greetingService; // By making it final, we can't change the object once we're inside the Object code

    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) { // Qualifier tells Spring which bean you want injected
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return this.greetingService.sayGreeting();
    }
}
