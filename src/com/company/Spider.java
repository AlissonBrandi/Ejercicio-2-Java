package com.company;

public class Spider extends Animal{

    public Spider(){
        super(8);
    }
    @Override
    public void eat() {
        System.out.println("La araña come verduras e insectos.");
    }

    @Override
    public void walk() {
        System.out.println("La araña camina con " + legs + " patas.");
    }

}
