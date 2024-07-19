package com.javatechie.spring.boot.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class SpringBootDockerApplication {

    // Display the form
    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    // Handle form submission
    @PostMapping("/calculate")
    public String calculate(
        @RequestParam("a") int a,
        @RequestParam("b") int b,
        @RequestParam("operation") String operation,
        Model model) {

        String result;

        switch (operation) {
            case "add":
                result = "Result of " + a + " + " + b + " = " + (a + b);
                break;
            case "subtract":
                result = "Result of " + a + " - " + b + " = " + (a - b);
                break;
            case "multiply":
                result = "Result of " + a + " * " + b + " = " + (a * b);
                break;
            case "divide":
                if (b == 0) {
                    result = "Error: Division by zero is not allowed.";
                } else {
                    result = "Result of " + a + " / " + b + " = " + (a / b);
                }
                break;
            default:
                result = "Invalid operation.";
                break;
        }

        model.addAttribute("result", result);
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }

}

