package com.company;

public class Cat extends Animal{
    private String X;

    public Cat(String name) {
        X=name;
    }

    public void introduceYourself(){
        System.out.println("Meow. I am a cat. My name is "+ X +".");
    }
}
