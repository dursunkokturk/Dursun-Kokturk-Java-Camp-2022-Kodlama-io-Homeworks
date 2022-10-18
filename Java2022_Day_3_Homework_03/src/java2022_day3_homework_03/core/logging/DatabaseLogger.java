package java2022_day3_homework_03.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Logged In Databse : " + data);
	}
}