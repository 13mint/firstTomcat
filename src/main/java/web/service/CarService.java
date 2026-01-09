package web.service;

import org.springframework.stereotype.Service;
import web.model.Cars;

import java.util.List;

public interface CarService {
    List<Cars> createCars();
}
