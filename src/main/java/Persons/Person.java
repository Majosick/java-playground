package Persons;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Person {
    private String name;
    private int age;

    @JsonGetter("fullName")
    public String getName() {
        return name;
    }

    @JsonSetter("fullName")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}