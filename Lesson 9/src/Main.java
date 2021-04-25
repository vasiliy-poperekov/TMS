import Car.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        Car car1 = new Car("Nissan", 200, 10000);
        Car car2 = new Car("Toyota", 180, 8000);

        cars.add(car1);
        cars.add(car2);

        for (Car car : cars) {
            try {
                car.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
