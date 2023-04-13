package model;
public class Person{
    String name; 
     public Person(String name){
        this.name = name; 

     }
     public String toString(){
        return "my name is " + this.name;
     }

     public String sayHello(){
        return "Hello from class Person my name is: " + this.name;
     }

}