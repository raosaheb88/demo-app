package com.example.demo_app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class CalculatController {

    @PostMapping("/calculator")
    public ResponseEntity<Map<String, Object>> calculator(@RequestBody Map<String, Object> request) {

        Map<String, Object> response = new HashMap<>();

        try {
            double number1 = Double.parseDouble(request.get("number1").toString());
            double number2 = Double.parseDouble(request.get("number2").toString());
            String operation = request.get("operation").toString().toUpperCase();

            double result;

            switch (operation) {
                case "ADD":
                    result = number1 + number2;
                    break;

                case "SUBTRACT":
                    result = number1 - number2;
                    break;

                case "MULTIPLY":
                    result = number1 * number2;
                    break;

                case "DIVIDE":
                    if (number2 == 0) {
                        response.put("error", "Cannot divide by zero");
                        return ResponseEntity.badRequest().body(response);
                    }
                    result = number1 / number2;
                    break;

                default:
                    response.put("error", "Invalid operation");
                    return ResponseEntity.badRequest().body(response);
            }

            response.put("number1", number1);
            response.put("number2", number2);
            response.put("operation", operation);
            response.put("result", result);

            return ResponseEntity.ok(response);

        } catch (Exception e) {
            response.put("error", "Invalid request");
            return ResponseEntity.badRequest().body(response);
        }
    }

}
