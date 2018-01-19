package com.mystarter.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author chen
 * @version V1.0
 * @date 2018/1/19
 */

@ConfigurationProperties(prefix = "person")
public class Person
{
    private String id;

    private String name;

    private String sex;

    private Integer age;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", sex='" + sex + '\'' +
               ", age=" + age +
               '}';
    }
}
