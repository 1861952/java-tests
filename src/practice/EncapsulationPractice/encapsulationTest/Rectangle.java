package practice.EncapsulationPractice.encapsulationTest;

public class Rectangle {
    // Declare instance variables as private in the class. 
    private int myLength;
    private int myWidth;
    // Declare a constructor Rectangle and define parameters of constructor.
    public Rectangle(int length, int width) {
        myLength = length;
        myWidth = width;
    } 
    // Create a getter method for each private variable. 
    public int getMyLength() {
        return myLength;
    }

    public int getMyWidth() {
        return myWidth;
    }
    // Create a setter method for each private variable and define parameter. 
    public void setMyLength(int newLength) {
        this.myLength = newLength;
    }

    public void setMyWidth(int newWidth) {
        this.myWidth = newWidth;
    }
}