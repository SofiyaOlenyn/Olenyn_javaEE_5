package library;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AnimalConfiguration.class)
public class AnimalConfiguration {
    @Bean
    @ConditionalOnProperty(value = "animal.type", havingValue = "parrot")
    Animal parrotAnimal() {
        return new Parrot();
    }

    @Bean
    @ConditionalOnProperty(value = "animal.type", havingValue = "dog")
    Animal dogAnimal() {
        return new Dog();
    }

}
