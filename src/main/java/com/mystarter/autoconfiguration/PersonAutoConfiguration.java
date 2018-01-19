package com.mystarter.autoconfiguration;

import com.mystarter.domain.Person;
import com.mystarter.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author chen
 * @version V1.0
 * @date 2018/1/19
 */
@Configuration
//@ConditionalOnClass(PersonService.class)
@EnableConfigurationProperties(Person.class)
public class PersonAutoConfiguration
{

    @Autowired
    private Person person;

    @Bean
    @ConditionalOnMissingBean
//    @ConditionalOnProperty
    PersonService personService()
    {
        return new PersonService(person);
    }
}
