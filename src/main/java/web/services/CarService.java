package web.services;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    List<Car> getSpecificCarCount(Integer count);
}
