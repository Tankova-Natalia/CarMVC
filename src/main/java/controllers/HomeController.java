package controllers;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String goHome(){
        return "home";
    }

    @GetMapping("/newCar")
    public String addCar(Model model){
        Car car = new Car();
        model.addAttribute("car", car);
        return "addCar";
    }
}
