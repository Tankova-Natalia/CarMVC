package controllers;

import controllers.CarService;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.awt.*;
import java.util.LinkedList;

@Controller
public class CarController {
    CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }
    @PostMapping()
    public String create(@Valid @ModelAttribute("car") Car car, BindingResult result, Model model){
        if(result.hasErrors()){
            System.out.println("Error! Kind is empty");
            return "addCar";
        }
        double averageMillage = carService.countAverageMileage(car);
        model.addAttribute("averageMillage", averageMillage);
        return "result";
    }
}