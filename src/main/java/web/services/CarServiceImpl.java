package web.services;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    ArrayList<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        for (int i = 1; i <= 5; i++) {
            cars.add(new Car(String.valueOf(i), String.valueOf(i), i * 10000));
        }
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getSpecificCarCount(Integer count) {
        if (count <= 0) {
            return Collections.emptyList();
        }
        return cars.stream()
                .limit(count)
                .toList();

    }
}
