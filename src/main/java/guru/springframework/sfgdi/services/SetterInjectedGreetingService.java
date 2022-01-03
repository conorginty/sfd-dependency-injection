package guru.springframework.sfgdi.services;

import com.springframework.greetings.GreetingService;

public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
