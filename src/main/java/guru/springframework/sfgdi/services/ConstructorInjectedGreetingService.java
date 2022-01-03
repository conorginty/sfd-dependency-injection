package guru.springframework.sfgdi.services;

import com.springframework.greetings.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
