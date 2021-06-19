package art.com.Employee;

import java.util.ArrayList;

public class Day11 extends Employee {

		public Day11(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
			Employee dang = new Employee("Dabg", "Red", 10000);
			Employee ceo = new CEO("Captain", "Marvel", 30000);
			Programmer prog = new Programmer("Capyin", "Marvel", 20000);
			CEO ceo2 = (CEO) ceo;
			
			ArrayList<Employee> myList = new ArrayList<>();
			myList.add(ceo2);
			myList.add(dang);
			myList.add(prog);
			CEO ceo3 = (CEO) myList.get(0);
			Employee dang2 = myList.get(1);
			Programmer prog2 = (Programmer) myList.get(2);
				ceo3.hello();
				prog2.hello();
		}
}
