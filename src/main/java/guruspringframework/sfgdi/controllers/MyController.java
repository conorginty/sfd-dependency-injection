package guruspringframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller // Using the Controller Stereotype makes this class a Spring-managed Component
public class MyController {

    public String sayHello() {
        System.out.println("Hello world!!!");

        return "Hi, Folks!";
    }
}
