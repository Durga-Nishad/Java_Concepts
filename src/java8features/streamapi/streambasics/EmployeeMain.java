package java8features.streamapi.streambasics;

import java.util.List;



public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		
		List<Employee> femaleEmployee = service.fetchFemaleEmployees();
		femaleEmployee.forEach(System.out::println);
		System.out.println("*".repeat(10));
		
		List<Employee> hikeMaleEmployee = service.afterHike();
		hikeMaleEmployee.forEach(System.out::println);
		System.out.println("*".repeat(10));
		
		Employee topEmployee = service.topPaidEmployee();
		System.out.println(topEmployee);
		System.out.println("*".repeat(10));
		
		List<Employee> top3Employee = service.top3PaidEmployee();
		top3Employee.forEach(System.out::println);
		System.out.println("*".repeat(10));
		
		List<String> employeeName = service.getEmployeeName();
		employeeName.forEach(System.out::println);
		System.out.println("*".repeat(10));
		
		double avgSalary = service.averageSalary();
		System.out.println("average salary is :- "+avgSalary);
		System.out.println("*".repeat(10));
		
		boolean greater5000 = service.checkSalary();
		System.out.println("Greater than 5000 employees :- "+greater5000);
		System.out.println("*".repeat(10));
		
		service.primitiveToString();
		System.out.println("*".repeat(10));
		
		service.findStringLength();
		System.out.println("*".repeat(10));
		
		service.flatMap();

	}

}
