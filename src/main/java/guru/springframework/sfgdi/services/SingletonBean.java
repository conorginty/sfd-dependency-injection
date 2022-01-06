package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Inside Singleton Bean Constructor");
    }

    public String getMyScope() {
        return "Singleton is my Scope is";
    }
}
