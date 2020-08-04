package com.atguigu.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Component 只有这个组件是容器中的组件，才能给容器提供@ConfigurationProperties的功能
 */
@Component
/**
 * @ConfigurationProperties告诉spring boot 将本类中的所有属性和配置文件中相关配置进行映射
 * prefix = "person" 映射的名称
 */

@ConfigurationProperties(prefix = "person")
/**
 * @Validated 数据校验
 */
@Validated
/**
 * @PropertySource 指定配置文件
 */
//@PropertySource(value = {"classpath:person.properties"})
public class Person {



    private String lastName;
    private Integer age;
    private Boolean zhiwei;
    private Date birth;


    private Map<String,Object> maps;

    private List<Object> lists;

    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getZhiwei() {
        return zhiwei;
    }

    public void setZhiwei(Boolean zhiwei) {
        this.zhiwei = zhiwei;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", zhiwei=" + zhiwei +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
