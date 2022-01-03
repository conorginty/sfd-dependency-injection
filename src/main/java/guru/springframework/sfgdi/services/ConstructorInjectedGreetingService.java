package guru.springframework.sfgdi.services;

import com.springframework.greetings.GreetingService;

public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
