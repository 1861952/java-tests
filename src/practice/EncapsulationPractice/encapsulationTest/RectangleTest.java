package practice.EncapsulationPractice.encapsulationTest;

public class RectangleTest {
    public static void main(String[] args) {
        // Create a setter method for each private variable and define parameter. 
        Rectangle rectangle = new Rectangle(20, 30);
        // Call getter method to read value of variable because we cannot read the value directly due to privacy. 
        int l = rectangle.getMyLength();
        int w = rectangle.getMyWidth();
        // Calculate area of the rectangle and print it on the console. 
        int area = l*w;
        System.out.println(area);
        // Let's update the new value of variable using setter method. 
        rectangle.setMyLength(50);
        rectangle.setMyWidth(20);
        // Call getter method to read the updated value. 
        int newL = rectangle.getMyLength();
        int newW = rectangle.getMyLength();
        int newArea = newL*newW;
        // Print new area
        System.out.println(newArea);

    }
}


/*Output: 
       Area: 600 
       New area: 3000 */