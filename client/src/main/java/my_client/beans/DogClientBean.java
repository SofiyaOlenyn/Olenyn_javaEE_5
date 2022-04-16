package my_client.beans;

import library.Dog;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(Dog.class)
public class DogClientBean implements InitializingBean {
    @Override
    public void afterPropertiesSet()  {
        System.out.println("Dog bean is created");
    }
}
