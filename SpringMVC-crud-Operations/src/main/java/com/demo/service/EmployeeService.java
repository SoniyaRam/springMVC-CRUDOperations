package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {
	public void addSEmployee(Employee s);

	public List<Employee> getAllEmployeesSvc();

	public void deleteEmPloyeeSvc(int id);

	public Employee getEmployeeByIdSvc(int id);
}
