package test_api.service;

import java.util.List;

import test_api.models.Car;

public interface CarService {
    
    public void create(Car car);
    public List<Car> list();

    public List<Car> selectByName();
}
