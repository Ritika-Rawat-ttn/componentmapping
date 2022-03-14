package com.example.ComponentMapping.repos;

import com.example.ComponentMapping.entities.employee;
import org.springframework.data.repository.CrudRepository;

public interface employeeRepository extends CrudRepository<employee,Integer> {
}
