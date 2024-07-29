package org.sample;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonNodeReaderPrac {
    public static void main(String[] args) {
        String filePath = "person.json";
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode rootNode = mapper.readTree(new File(filePath));
            String name = rootNode.get("name").asText();
            int age = rootNode.get("name").asInt();
            String email = rootNode.get("email").asText();
            System.out.println("name:" + name);
            System.out.println("age:" + age);
            System.out.println("email:" + email);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
