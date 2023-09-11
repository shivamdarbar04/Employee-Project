package com.employee.Service;

import java.util.List;

import com.employee.Entity.Employee;

public interface EmpService {

	public Employee saveEmployee(Employee employee);
	
	public List<Employee> getalllEmployees();
	
	public Employee getEmpById(int id);
	
	public boolean deleteEmp(int id);

	
	
}
