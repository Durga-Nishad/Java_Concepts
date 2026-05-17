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

	}

}
