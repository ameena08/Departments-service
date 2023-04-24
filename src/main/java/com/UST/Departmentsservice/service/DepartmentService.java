package com.UST.Departmentsservice.service;

import com.UST.Departmentsservice.entity.department;
import com.UST.Departmentsservice.repository.Departmentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private Departmentrepository repo;
    public department findDepartmentById(Long departmentId) {
        return repo.findByDepartmentId(departmentId);
    }

    public department saveDepartmentById(department department) {
        return repo.save(department);
    }
}
