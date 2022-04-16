package my_client.beans;

import library.Parrot;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(Parrot.class)
public class ParrotClientBean implements InitializingBean {
    @Override
    public void afterPropertiesSet(){
        System.out.println("Parrot bean is created");
    }
}
