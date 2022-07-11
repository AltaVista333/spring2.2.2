package web.services;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    ArrayList<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        for (int i = 1; i <= 5; i++) {
            cars.add(new Car(String.valueOf(i), String.valueOf(i), i * 10000));
        }
    }

    public List<Car> getCarsWithOptionalCount(Optional<Integer> count) {
        return count.map(x -> cars.stream().limit(x).toList())
                 .orElse(cars);
    }
}
