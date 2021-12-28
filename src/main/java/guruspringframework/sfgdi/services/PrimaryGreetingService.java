package guruspringframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary // Qualifiers will take Precedence over Primary, but when there is no Qualifier, this is the situation we want to control for
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World- From the PRIMARY Bean!!!";
    }
}
