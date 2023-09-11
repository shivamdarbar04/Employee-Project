package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.Entity.Employee;
import com.employee.Service.EmpService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@Autowired
	private EmpService empService;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/base")
	public String base()
	{
		return "base";
	}
	
	@RequestMapping("/src")
	public String src()
	{
		return "src";
	}
	
	@RequestMapping("/edit_emp")
	public String edit()
	{
		return "edit_emp";
	}
	
	@RequestMapping("/emp_save")
	public String save()
	{
		return "emp_save";
	}
	
	
}
