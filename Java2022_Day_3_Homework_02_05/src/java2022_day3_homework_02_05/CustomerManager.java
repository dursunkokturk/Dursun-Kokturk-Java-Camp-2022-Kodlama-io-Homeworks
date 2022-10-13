package java2022_day3_homework_02_05;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("Customer Added");
		this.logger.Log("Log Message");
	}
}