package my_client.beans;

import library.Parrot;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnMissingBean(Parrot.class)
public class ParrotClientMissingBean implements InitializingBean {
    @Override
    public void afterPropertiesSet(){
        System.out.println("Parrot on missing");
    }
}
