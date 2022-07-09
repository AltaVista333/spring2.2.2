package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;

import java.util.Optional;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printTableWithAllCars(ModelMap model,
                                        @RequestParam(required = false) Optional<Integer> count) {

        count.ifPresentOrElse(
                cnt -> model.addAttribute("cars",
                        carService.getSpecificCarCount(cnt)),
                () -> model.addAttribute("cars",
                        carService.getAllCars()));
        return "cars";
    }
}
