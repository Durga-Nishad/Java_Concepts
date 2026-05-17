package java8features.streamapi.streambasics;

public class Employee {
	private int empno;
	private String ename;
	private double salary;
	private String gender;
	public Employee(int empno, String ename, double salary, String gender) {
		//super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + ", gender=" + gender + "]";
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
