package com.employee.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.employee.controller.EmployeeOperationsController;
import com.employee.model.Employee;

@Component
public class RealtimeDITestRunner  implements CommandLineRunner {
	@Autowired
	private  EmployeeOperationsController  controller;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RealtimeDITestRunner.run()");
		//invoke the b.method
		List<Employee> list=controller.showEmployeesByDesgs("MANAGER", "SALESMAN", "CLERK");
		list.forEach(emp->{
			System.out.println(emp);
		});
		
	}

}
