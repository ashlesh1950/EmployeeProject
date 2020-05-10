package test;

import model.Employee;
import operations.EmployeeWork;

public class TestClass {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setId(100);
		e.setName("xyz");
		e.setSalary(10000);
		
		EmployeeWork ew = new EmployeeWork();
		ew.addEmployee(e);
	}

}
