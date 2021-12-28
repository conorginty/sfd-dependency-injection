package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// WORST way to do Dependency Injection...
@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return this.greetingService.sayGreeting();
    }
}
