package web.service;

import org.springframework.stereotype.Service;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Cars> createCars(){
        List<Cars> cars = new ArrayList<>();
        cars.add(new Cars("BMW","Black"));
        cars.add(new Cars("Audi","White"));
        cars.add(new Cars("Mercedes","Silver"));
        cars.add(new Cars("Toyota","Red"));
        cars.add(new Cars("Volkswagen","Blue"));

        return cars;
    }
}
