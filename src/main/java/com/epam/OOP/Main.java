package com.epam.OOP;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("grey", 4, true);
        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }


}
