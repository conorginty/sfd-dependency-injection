package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.GreetingService;

// WORST way to do Dependency Injection...
public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return this.greetingService.sayGreeting();
    }
}
