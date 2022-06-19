package practice;
// static methods can be accessed without creating an object of the class
public class moreCars {

    // public methods can only be accessed by objects 
    // Main method
    public static void main(String[] args) {
        carFeatures myCar = new carFeatures();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}