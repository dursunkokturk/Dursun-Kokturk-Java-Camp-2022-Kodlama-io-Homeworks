package java2022_day3_homework_02_04;

public class Main {

	public static void main(String[] args) {
		// Inheritance Yapisini Anlamak
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		
		customer.customerFirstName = "Dursun";
		customer.customerLastName = "Köktürk";
		customer.customerAge = 36;
		customer.customerEmail = "dursunserefkokturk@gmail.com";
		
		employee.customerFirstName = "Dursun";
		employee.customerLastName = "Köktürk";
		employee.customerAge = 36;
		employee.employeeSalary = 5000;		
	}
}