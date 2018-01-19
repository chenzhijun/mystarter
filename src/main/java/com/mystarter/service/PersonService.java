package com.mystarter.service;

import com.mystarter.domain.Person;

/**
 *
 * @author chen
 * @version V1.0
 * @date 2018/1/19
 */
public class PersonService
{
    Person person;

    public String getPersonToString()
    {

        return person.toString();
    }

    public PersonService(Person person)
    {
        this.person = person;
    }
}
