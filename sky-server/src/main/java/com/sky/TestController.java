package com.sky;


import com.sky.entity.DishFlavor;
import com.sky.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TestController {

    private final ServerProperties serverProperties;

    @Autowired
    private EmployeeMapper employeeMapper;

    public TestController(ServerProperties serverProperties) {
        this.serverProperties = serverProperties;
    }


    @GetMapping("/test")
    public String test() {

        ArrayList<DishFlavor> x = employeeMapper.getDishFlavor();

        System.out.println("xxxxx:" + x);


        return "aaa";
    }


}
