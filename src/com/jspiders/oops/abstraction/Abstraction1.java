package com.jspiders.oops.abstraction;

//Object implementation layer
abstract class Vehicle{
    abstract public void start();
    public void fuel(){
        System.out.println("fiiling fuel at gas station");
    }
}
class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("car starts with key ");
    }
}
class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("bike starts with kick as well as key");
    }
}
//Object creation layer
class ObjectCreation{
    public Vehicle getObject(String name){
        if(name.equals("car")){
            return new Car();
        }
        return new Bike();
    }
}
//object utilisation layer
class Abstarction1{
    public static void main(String[] args) {
        ObjectCreation o = new ObjectCreation();
        Vehicle v1 =  o.getObject("car");
        Vehicle v2 = o.getObject("bike");
        v1.start();
        v2.start();
    }
}
