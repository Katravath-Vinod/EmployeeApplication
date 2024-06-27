package com.example.EmployeeApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Emp")
public class EmployeeController {
    @GetMapping("/Employee")
  public  String hello()
    {

        System.out.println("Hi......");
        return "Hello";
    }

}
