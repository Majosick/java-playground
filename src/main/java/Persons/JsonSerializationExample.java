package Persons;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializationExample {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);

        String jsonString = objectMapper.writeValueAsString(person);

        System.out.println(jsonString);
    }
}