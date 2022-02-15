package places;

import cars.Car;

import java.util.ArrayList;

public class Dealership {
    ArrayList<Car> cars;

    public Dealership(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}
