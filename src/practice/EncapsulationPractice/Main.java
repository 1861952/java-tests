package practice.EncapsulationPractice;

// ENCAPSULATION: makes sure that "sensitive" data is hidden from users
// -> declare class variables/attributes and private
// -> provide public get and set methods to access 
//    and update the value of a private variable

public class Main {
    public static void main(String[] args) {
        Person myObj = new Person();
        // myObj.name = "John"; -> ERROR
        // System.out.println(myObj.name); -> ERROR
        myObj.setName("John");
        System.out.println(myObj.getName());


    }
}