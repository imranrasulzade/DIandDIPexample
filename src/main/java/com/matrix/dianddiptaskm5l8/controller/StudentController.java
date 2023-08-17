package com.matrix.dianddiptaskm5l8.controller;

import com.matrix.dianddiptaskm5l8.service.CustomerService;
import com.matrix.dianddiptaskm5l8.service.Impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    private CustomerService customerService;

    public StudentController(@Qualifier("userServiceImpl") CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/hello")
    public String hello(){
        return customerService.sayhello();
    }
}
