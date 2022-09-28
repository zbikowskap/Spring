package com.example.di;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> carList;

    public CarService() {
        Car car1 = new Car("X", "Tesla");
        Car car2 = new Car("Kodiaq", "Skoda");
        Car car3 = new Car("CX-5", "Mazda");
        carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
    }

    public List<Car> getCars() {
        return carList;
    }

}
