package com.UST.Departmentsservice.controller;

import com.UST.Departmentsservice.entity.department;
import com.UST.Departmentsservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService services;
    @PostMapping("/")
    public department saveDepartmentById(@RequestBody department department){
        return services.saveDepartmentById(department);
    }
    @GetMapping("/{id}")
    public department findDepartmentById(@PathVariable("id")Long departmentId){
        return services.findDepartmentById(departmentId);
    }


}
