package Persons;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializationExample {

    public static void main(String[] args) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);

        // Serializing
        String jsonString = objectMapper.writeValueAsString(person);
        System.out.println(jsonString);

        // Deserializing
        String jsonInput = "{\"fullName\":\"Jane Doe\"}";
        Person personFromJson = objectMapper.readValue(jsonInput, Person.class);
        System.out.println(personFromJson.getName());  // Jane Doe
    }
}

class Person {
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