package guru.springframework.sfgdi.config;

import com.springframework.greetings.I18nEnglishGreetingService;
import com.springframework.greetings.I18nSpanishGreetingService;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.*;

@ImportResource("classpath:sfgdi-config.xml") // Notifies Spring of the XML config file
@Configuration
public class GreetingServiceConfig {

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean("i18nService")
    I18nEnglishGreetingService i18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Profile({"ES", "default"}) // We can have multiple active beans, and by making one of the Profiles "default", this will be what's injected in when there are no Active Profiles
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService() {
        return new I18nSpanishGreetingService();
    }

    @Primary // Qualifiers will take Precedence over Primary, but when there is no Qualifier, this is the situation we want to control for
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

//    @Bean
//    ConstructorInjectedGreetingService constructorInjectedGreetingService() {
//        return new ConstructorInjectedGreetingService();
//    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}
