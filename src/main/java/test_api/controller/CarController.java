package test_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test_api.models.Car;
import test_api.service.CarService;

@RestController
@RequestMapping("/api/car")
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping("/create")
    public String create(@RequestBody Car car){
        carService.create(car);
        return "Success";
    }
    @GetMapping("/list")
    public List<Car> list(){
        return carService.list();
    }

    @GetMapping("/getcar")
    public List<Car> find(@RequestBody Car car){
        return carService.selectByName();
        
    }
}
