# Springboot-Rest-Demo
Build  a REST API with springboot ,spring data JPA,MYSQL for employee management system using VS code
this project uses 3 tier architecture controller,service and repository .
controller is an API layer which handles the client http requests using POSTMAN CLIENT. repository layer consists of connection with the database .I have used MYSQL dtabses for this project .Repository interface is inejcted in the service implemnetation class which enables us to use the JPARepository interface methods .
And finally controoler i.e the Rest controller class is injected with the service interface enabling us to access the logic or application layer.

Problem statement : Create REST API for EMS .Client should be able to 
1.Get list of employees
2.Get single employee 
3.Create a new employee
4.Update existing one
5.delete it 


