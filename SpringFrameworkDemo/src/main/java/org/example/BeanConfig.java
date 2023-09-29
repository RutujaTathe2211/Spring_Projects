package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//java configuration
@Configuration
@ComponentScan(basePackages = "org.example")
public class BeanConfig {
    @Bean //declare bean by using annotation
    /*
    bean scope:
    -singleton:when we request object from container we get only one object
    -prototype:we get different object everytime
    -request-used for web aware context
    -session:used for web aware context
    -global session:used for web aware context(mvc)

    *lifecycle of beans:
    definition of bean->bean creation/instantiation->populate property->post initialization->destruction of bean->bean destroy
     */
    public Doctor doctor(){
        return new Doctor();
    }
}
