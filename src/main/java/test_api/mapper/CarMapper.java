package test_api.mapper;

import java.util.List;

import test_api.models.Car;

public interface CarMapper {
    public void create(Car car);
    public List<Car> list();
    public List<Car> selectByName();
}
