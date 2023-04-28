package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {
    @Override
    public String result(String number1, String number2, String calculator) {
        try {
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);
            double result = 0;

            switch (calculator) {
                case "add":
                    result = num1 + num2;
                    break;
                case "sub":
                    result = num1 - num2;
                    break;
                case "mul":
                    result = num1 * num2;
                    break;
                case "div":
                    if (num2 == 0) {
                        return "cannot be divided by 0";
                    }
                    result = num1 / num2;
            }
            return String.valueOf(result);

        } catch (NumberFormatException e) {
            return "please enter number!";
        }
    }
}
