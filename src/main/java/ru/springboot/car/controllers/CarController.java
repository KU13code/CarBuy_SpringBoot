package ru.springboot.car.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.springboot.car.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private List<Car> cars = new ArrayList<>();
    private long ID = 0l;


    {
        cars.add(new Car(ID++, "BMW","X5",8000000));
        cars.add(new Car(ID++, "KIA","RIO",1500000));
        cars.add(new Car(ID++, "KIA","OPTIMA",2500000));
        cars.add(new Car(ID++, "Opel","Astra",1800000));
    }

    @GetMapping("/")
    public String cars(Model model){
        model.addAttribute("cars", cars);
        return "cars";
    }

    @PostMapping("/create")
    public String createCar(Car car){
        car.setId(++ID);
        cars.add(car);
        return "redirect:/";
    }














}
