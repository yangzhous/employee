package com.yang.controller;

import com.yang.pojo.Employee;
import com.yang.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class EmployeeController {
    @Autowired
    @Qualifier("EmployeeServiceImp")
    private EmployeeService employeeService;

    @RequestMapping("/allEmployee")
    public String list(Model model){
        List<Employee> list = employeeService.queryAllEmployee();
        model.addAttribute("list",list);
        return list.toString();
    }

}
