package com.calculator.Calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    private final Calculator calculator = new Calculator();

    @GetMapping("/")
    public String calculatorForm(Model model) {
        model.addAttribute("result", "");
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam String operation,
            @RequestParam String numbers,
            Model model) {
        try {
            String[] numArray = numbers.split(",");
            int[] nums = new int[numArray.length];
            for (int i = 0; i < numArray.length; i++) {
                nums[i] = Integer.parseInt(numArray[i].trim());
            }

            int result = 0;
            switch (operation) {
                case "add":
                    result = calculator.add(nums);
                    break;
                case "subtract":
                    result = calculator.subtraction(nums);
                    break;
                case "multiply":
                    result = calculator.multiply(nums);
                    break;
                case "divide":
                    result = calculator.division(nums);
                    break;
                default:
                    result = 0;
                    break;
            }

            model.addAttribute("result", "Result: " + result);
        } catch (Exception e) {
            model.addAttribute("result", "Error: " + e.getMessage());
        }
        return "calculator";
    }
}
