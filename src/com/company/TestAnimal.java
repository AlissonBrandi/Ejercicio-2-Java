package com.company;

public class TestAnimal {

    public static void main(String[] args) {

        Fish f = new Fish();
        Cat c = new Cat("Michi");
        Animal a = new Fish();
        Animal s = new Spider();
        Cat c2 = new Cat("gato");

        System.out.println("-----------------------------------------------");
        f.eat();
        f.walk();
        f.play();
        System.out.println("-----------------------------------------------");
        c.eat();
        c.play();
        System.out.println("-----------------------------------------------");
        a.eat();
        a.walk();
        System.out.println("-----------------------------------------------");
        s.eat();
        s.walk();
        System.out.println("-----------------------------------------------");
        c2.play();
        c2.eat();
        System.out.println("-----------------------------------------------");
    }
}
