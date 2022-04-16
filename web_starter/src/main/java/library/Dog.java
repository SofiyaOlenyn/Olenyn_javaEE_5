package library;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "animal.type", havingValue = "dog")
public class Dog implements Animal, InitializingBean {
    private String name = "Tyzik";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return "bark";
    }

    @Override
    public String move() {
        return "runs";
    }

    public void afterPropertiesSet() {
        System.out.println("Dog " + getName() + ". It " + speak() + " and " + move());
    }
}
