package ru.geekbrains.lession1;

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("Персону зовут " + name);
    }
}
