package guru.springframework.sfgdi.services;

import com.springframework.greetings.GreetingService;

public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World- From the PRIMARY Bean!!!";
    }
}
