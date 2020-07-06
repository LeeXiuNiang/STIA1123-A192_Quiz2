package com.company;

public class Dog extends Animal{

    private String X;

    public Dog(String name) {
        X=name;
    }

    public void introduceYourself(){
        System.out.println("Woof. I am a dog. My name is "+ X +".");
    }
}
