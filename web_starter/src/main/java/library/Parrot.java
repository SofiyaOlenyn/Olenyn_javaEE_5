package library;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "animal.type", havingValue = "parrot")
public class Parrot implements Animal, InitializingBean {
    private String name = "Sussi";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return "chirps";
    }

    @Override
    public String move() {
        return "flies";
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Parrot " + getName() + ". It " + speak() + " and " + move());
    }
}
