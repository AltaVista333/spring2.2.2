package web.services;

import web.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    List<Car> getCarsWithOptionalCount(Optional<Integer> count);
}
