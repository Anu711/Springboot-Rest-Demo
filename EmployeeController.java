package com.example.ems.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ems.Entity.Employee;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/hello")
    public String getMessage() {
        return "Hello boot";
    }

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee) {

        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @GetMapping("/getall")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/getone/{employeeId}")
    public Employee getEmployee(@PathVariable(name = "employeeId") Long employeeId) {
        return employeeService.getEmployee(employeeId);
    }

    @DeleteMapping("/delete/{employeeId}")
    public void deleteEmployee(@PathVariable(name = "employeeId") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
    }
}
