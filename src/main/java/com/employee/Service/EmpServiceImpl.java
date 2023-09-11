package com.employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.Entity.Employee;
import com.employee.repository.EmployeeRepo;

import jakarta.servlet.http.HttpSession;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private EmpService empService;

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee emp = employeeRepo.save(employee);
		return emp;
	}

	@Override
	public List<Employee> getalllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmpById(int id) {
		return employeeRepo.findById(id).get();

	}

	@Override
	public boolean deleteEmp(int id) {
		Employee emp = employeeRepo.findById(id).get();
		if(emp!= null)
		{
			employeeRepo.delete(emp);
			return true;
		}
		return false;
	}
	
	@PostMapping("/save_Emp")
	public String saveEmp(@ModelAttribute Employee employe ,HttpSession session)
	{
//	  empService.saveEmployee(employe);
	   
		Employee emp = empService.saveEmployee(employe);
		
	    
	    if(emp!=null)
	    {
	    	session.setAttribute("msg", "Register Successfully");
	    }
	    else
	    {
	    	session.setAttribute("msg", "Something wrong on server");
	    }
	    
		return "save_emp";
	}

}
