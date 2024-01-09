package com.overridingassign;
class Person {
   
    void readScript() {
        System.out.println("Person reading the script");
    }
}


class Actor extends Person {

    @Override
    void readScript() {
        System.out.println("Actor reading and rehearsing the script");
       
    }
}
public class Anchorperson {
    public static void main(String[] args) {
        
        Person person = new Person();


        System.out.println("Person Information:");
        person.readScript();
        System.out.println();


        Actor actor = new Actor();


        System.out.println("Actor Information:");
        actor.readScript();
    }

}
