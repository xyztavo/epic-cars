package br.com.etecia.epiccars.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.etecia.epiccars.model.Car;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/cars")
public class CarsController {
    
    private List<Car> repository = new ArrayList<>();

    @GetMapping
    public String listCars(Model model) {
        model.addAttribute("cars", repository);

        return "cars";
    }
    @GetMapping("/form")
    public String showForm() {
        return "form";
    }
    @PostMapping("/form")
    public String create(Car car) {
        System.out.println(car);      
        repository.add(car);
        return "form";
    }
    
}


