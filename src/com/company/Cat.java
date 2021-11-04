package com.company;

public class Cat  extends Animal implements Pet{
    String nombre = "gato";


    public Cat(String nombre){
         super(4);
         this.nombre=nombre;
    }
    public Cat(){
        this("");
    }

    @Override
    public String getName() {
        return this.nombre;
    }

    @Override
    public void setName(String nombre) {
     this.nombre = nombre;
    }

    @Override
    public void play() {
        System.out.println("El " + this.nombre + " juega con las pelotas.");
    }

    @Override
    public void eat() {
        System.out.println("El " + this.nombre + " come ratones.");
    }

    @Override
    public void walk() {

    }


}
