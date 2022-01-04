package guru.springframework.sfgdi.repositories;

// N.B. - Remember for Dependency Injection, we prefer to code to an Interface!
public interface EnglishGreetingRepository {
    String getGreeting();
}
