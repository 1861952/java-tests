
public class Car {
    public static int cars = 0;
    private String name;
    public Car(String name) {
        this.name = name;
        cars++;
    }

    public String getName() {
        return this.name;
    }
}