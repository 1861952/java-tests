package practice.EncapsulationPractice;

/* private variables can only be accesssed within the class,
however, it is possible to access them if we provide public
get and set methods
-> get method returns the variable value
-> set method sets the value
Syntax for both is that they start with either get or set, 
followed by the name of the variable, with the first letter in upper case
*/

public class Person {
    private String name; // private = restricted

    // Getter
    public String getName() {
        return name;
    }

    // Setter 
    public void setName(String newName) {
        this.name = newName;
    }


}