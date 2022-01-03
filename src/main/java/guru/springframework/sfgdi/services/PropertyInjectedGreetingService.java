package guru.springframework.sfgdi.services;

import com.springframework.greetings.GreetingService;

public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
