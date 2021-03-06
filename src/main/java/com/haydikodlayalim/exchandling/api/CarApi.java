package com.haydikodlayalim.exchandling.api;

import com.haydikodlayalim.exchandling.dto.Car;
import com.haydikodlayalim.exchandling.exception.EntityNotfoundException;
import com.haydikodlayalim.exchandling.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarApi {

    @Autowired
    private CarService carService;

    @GetMapping
    public ResponseEntity<Car> getCar(@RequestParam String name) {
        return ResponseEntity.ok(carService.getCar(name));
    }
    /**
    @ExceptionHandler({EntityNotfoundException.class})
    public String entityNotFound() {
        return "Record not found";
    }
    **/
}
