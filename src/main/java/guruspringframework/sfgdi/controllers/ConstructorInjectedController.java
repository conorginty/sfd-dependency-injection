package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.GreetingService;

// BEST way to do Dependency Injection...
public class ConstructorInjectedController {
    private final GreetingService greetingService; // By making it final, we can't change the object once we're inside the Object code

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return this.greetingService.sayGreeting();
    }
}
