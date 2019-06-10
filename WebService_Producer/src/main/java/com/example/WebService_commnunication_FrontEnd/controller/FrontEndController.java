package com.example.WebService_commnunication_FrontEnd.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WebService_commnunication_FrontEnd.model.Employee;

@RestController
public class FrontEndController {

	
	@RequestMapping(value="/getData")
	public List<Employee> m1(){
		System.out.println("8082 port controller entered to get data");
		List<Employee> l = new ArrayList<Employee>();
		Employee e = new Employee();
		e.setId(101);
		e.setName("sujit");
		e.setSurname("jagdale");
		e.setAddress("pune");
		System.out.println("8082 port controller employee object is created and pulled");
		l.add(e);
		
		return l;
	}
}
