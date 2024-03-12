package com.example.ems.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ems.Entity.Employee;

@Repository
public interface Employeerepository extends CrudRepository<Employee, Long> {

}
