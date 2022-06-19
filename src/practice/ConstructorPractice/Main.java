package practice.ConstructorPractice;

public class Main {
    int x; // class attribute
    //Class constructor for the Main class
    // A constructor is a special method that is used to initialize objects
    // The constructor is called when an object of a class is created
    // It can be used to set initial values for object attributes
    public Main() {
        x=5; //sets initial value for the class attribute x
    }

    public static void main(String[] args) {
        Main myObj = new Main(); // crates object of class Main (calls constructor)
        System.out.println(myObj.x);
        // Constructors with parameters
        ConstructsWithParameters carObj = new ConstructsWithParameters(2022, "Tesla");
        System.out.println(carObj.modelYear+ " " + carObj.modelName); 
    }
}