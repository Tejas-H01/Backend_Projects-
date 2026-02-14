package com.example.calculator.controller;

import com.example.calculator.model.CalcRequest;
import com.example.calculator.model.CalcResponse;
import com.example.calculator.service.ArithmeticService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class Controller {

    private final ArithmeticService service;

    public Controller(ArithmeticService service) {
        this.service = service;
    }

    @PostMapping("/calculate")
    public CalcResponse calculate(@RequestBody CalcRequest request) {

        int result;

        switch (request.getOperation()) {
            case "add":
                result = service.add(request.getA(), request.getB());
                break;

            case "sub":
                result = service.sub(request.getA(), request.getB());
                break;

            case "mul":
                result = service.mul(request.getA(), request.getB());
                break;

            case "div":
                result = service.div(request.getA(), request.getB());
                break;

            default:
                throw new IllegalArgumentException(
                        "Invalid operation: " + request.getOperation()
                );
        }

        return new CalcResponse(result);
    }
}
