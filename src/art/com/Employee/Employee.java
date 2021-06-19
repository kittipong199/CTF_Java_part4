package art.com.Employee;

public class Employee {
	
	public String firstname;
	public String lastname;
	public int salary;
	public String position;

	public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
	    this.firstname = firstnameInput;
	    this.lastname = lastnameInput;
	    this.salary = salaryInput;
	    this.position = "Stuff";
	}
	public Employee(String firstname, String lastname, int salary, String position) {
	    this(firstname, lastname, salary);
	    this.position = position;
	  }
}
