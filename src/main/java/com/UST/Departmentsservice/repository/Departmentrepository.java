package com.UST.Departmentsservice.repository;

import com.UST.Departmentsservice.entity.department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Departmentrepository extends JpaRepository<department,Long> {
 department findByDepartmentId(Long departmentId);
}
