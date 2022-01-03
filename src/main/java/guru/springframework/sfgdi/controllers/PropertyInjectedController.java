package guru.springframework.sfgdi.controllers;

import com.springframework.greetings.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// WORST way to do Dependency Injection...
@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGreetingService") // Tells Spring which bean you want injected
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return this.greetingService.sayGreeting();
    }
}
