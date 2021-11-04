package com.company;

public class Fish extends Animal implements Pet {

    private String nombre="Pez";

    public Fish(){
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("El "+ this.nombre + " come comida para peces");
    }

    @Override
    public void walk() {
        System.out.println("El "+ this.nombre + " no puede caminar porque no tiene patas.");
    }

    @Override
    public String getName() {
        return this.nombre;
    }

    @Override
    public void setName(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void play() {
        System.out.println("El " + this.nombre + " no juega.");
    }
}
