import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    public static void main(String[] args) {
        String[] buyers = {"Anne", "Bob", "Carl"};
        List<Car> carlist;
        carlist = new ArrayList<>();

        for (String buyer: buyers) {
            carlist.add(new Car(buyer));
        }

        System.out.println(Car.cars);
        System.out.println(carlist.size());

        for(Car car: carlist) {
            String name = car.getName();
            System.out.println(name);
        }
    }

}