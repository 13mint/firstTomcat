package web.service;

import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl {
    public List<Cars> createCars(){
        List<Cars> cars = new ArrayList<>();
        cars.add(new Car("BMW", 3, "Black"));
        cars.add(new Car("Audi", 5, "White"));
        cars.add(new Car("Mercedes", 200, "Silver"));
        cars.add(new Car("Toyota", 10, "Red"));
        cars.add(new Car("Volkswagen", 7, "Blue"));

        return cars;
    }
}
