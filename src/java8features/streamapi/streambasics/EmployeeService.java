package java8features.streamapi.streambasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeService {
public static List<Employee> getEmployee(){
		
		List<Employee> empArrayList = new ArrayList<>();
		
		empArrayList.add(new Employee(102,"harsha",5000.00,"female"));
		empArrayList.add(new Employee(105,"komal" , 6000.00, "male"));
		empArrayList.add(new Employee(101,"kanika", 7000.00 , "female"));
		empArrayList.add(new Employee(108,"pooja", 5000.00,"female"));
		empArrayList.add(new Employee(106 , "Ajay", 7000.00, "male"));
		empArrayList.add(new Employee(107,"Ravi",9000.00,"male"));
		
		return empArrayList;	
	}
	
	
	public List<Employee> fetchFemaleEmployees(){
		
		List<Employee> employees = EmployeeService.getEmployee();
		
		return employees.stream().filter(e->e.getGender().equalsIgnoreCase("female")).collect(Collectors.toList());
		
	}
	
	public List<Employee> afterHike(){
		List<Employee> employees = EmployeeService.getEmployee();
		
		return employees.stream().filter(e->e.getGender().equalsIgnoreCase("male")).map(e->{e.setSalary( e.getSalary() *1.1);return e;}).collect(Collectors.toList());
	}
	
	public Employee topPaidEmployee() {
		List<Employee> employees = EmployeeService.getEmployee();
		
		return employees
				.stream()
				.max((e1,e2)->
				{
					if(e1.getSalary()<e2.getSalary())
						return -1;
					else if(e1.getSalary() == e2.getSalary())
						return 0;
					else
						return 1;
				}).get();
	}
	
	public List<Employee> top3PaidEmployee(){
		List<Employee> employees = EmployeeService.getEmployee();
		
		return employees.stream().
				sorted((e1, e2)->
				{
					if(e1.getSalary()<e2.getSalary())
						return 1;
					else if(e1.getSalary() == e2.getSalary())
						return 0;
					else
						return -1;
				}
				).limit(3).toList();		
	}
	
	public List<String> getEmployeeName(){
		List<Employee> employees = EmployeeService.getEmployee();
		
		return employees.stream().map(Employee::getEname).toList();
	}

	public double averageSalary() {
		List<Employee> employees = EmployeeService.getEmployee();
		
		return employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
		
	}
	
	public boolean checkSalary() {
		List<Employee> employees = EmployeeService.getEmployee();
		
		boolean salary = employees.stream().allMatch(e->e.getSalary()>5000);
		return salary;
	}
	
	public void primitiveToString() {
		List<Integer> intsList = Arrays.asList(10,33,20,50,40,80);
		
		intsList.stream().map(String::valueOf).forEach(System.out::println);
	}

	public void findStringLength() {
		List<String> strList = Arrays.asList("Seema","Damini","leena","sanjana","divya");
		
		strList.stream().map(String::length).forEach(System.out::println);
	}
	
	public void flatMap() {
		List<Integer> lst1  = Arrays.asList(10,20,30);
		List<Integer> lst2 = Arrays.asList(40,50,60);
		
		List<List<Integer>> lst3 = Arrays.asList(lst1, lst2);
		
		List<Integer> lst4 = lst3.stream().flatMap(e->e.stream()).toList();
		System.out.println(lst4);
		
	}
}
