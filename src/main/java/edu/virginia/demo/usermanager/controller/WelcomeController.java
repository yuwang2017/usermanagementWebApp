package edu.virginia.demo.usermanager.controller;

import edu.virginia.demo.usermanager.model.Fruit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("username", "Matthew");
        return "welcome";
    }
    @GetMapping("/getFruits")
    public String getFruits(Model model){
        List<Fruit> fruits = new ArrayList<>();
        Fruit f1 = new Fruit("Apple", "Green");
        Fruit f2 = new Fruit("Banana", "Yellow");
        Fruit f3 = new Fruit("Peach", "Red");
        fruits.add(f1);
        fruits.add(f2);
        fruits.add(f3);
        model.addAttribute("fruits", fruits);
        return "fruitList";
    }

}
