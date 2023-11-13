package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        Person person = new Person("Mihail", "Gorban");
        System.out.println(GSON.toJson(person));
    }
}