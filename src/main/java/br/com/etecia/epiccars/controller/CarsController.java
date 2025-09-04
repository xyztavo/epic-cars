package br.com.etecia.epiccars.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.etecia.epiccars.model.Car;
import br.com.etecia.epiccars.repository.CarRepository;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/cars")
public class CarsController {
    
    // private List<Car> repository = new ArrayList<>();
    @Autowired
    private CarRepository repository;

    @GetMapping
    public String listCars(Model model) {
        model.addAttribute("cars", repository.findAll());

        return "cars";
    }
    @GetMapping("/form")
    public String showForm() {
        return "form";
    }
    @PostMapping("/form")

    public String create(Car car, RedirectAttributes redirect) {
        System.out.println(car);      
        repository.save(car);
        redirect.addFlashAttribute("message", "Listagem cadastrada com sucesso");
        return "redirect:/cars";
    }
    
}


