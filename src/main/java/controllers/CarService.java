package controllers;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Component
public class CarService {
    public CarService() {
    }

    public int countAverageMileage(Car car){
        return car.getGeneralMileage()/(LocalDate.now().getYear()-car.getDateOfRegistration().getYear());
    }
}
