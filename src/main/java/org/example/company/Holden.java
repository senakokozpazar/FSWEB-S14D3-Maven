package org.example.company;

public class Holden extends  Car{
    public Holden(int cylinders, String name){
        super(cylinders, name);
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the " + getName() + "'s engine is starting";
    }

    public String accelerate(){
        System.out.println(getClass().getSimpleName());
        return "the " + getName() + " is accelerating";
    }

    public String brake(){
        System.out.println(getClass().getSimpleName());
        return "the " + getName() + " is braking";
    }

}
