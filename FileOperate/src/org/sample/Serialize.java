package org.sample;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.tools.javac.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialize {
    public static void main(String[] args){
        try {
            FileOutputStream fos = new FileOutputStream("save.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Person p = new Person("test", 10, "test1");
            oos.writeObject(p);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
