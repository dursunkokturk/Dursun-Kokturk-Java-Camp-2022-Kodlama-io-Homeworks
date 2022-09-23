package java2022_day1_homework_12;

public class Main {

	public static void main(String[] args) {
		
		// Cok Boyutlu Diziler Ile Calismak
		String[][] cities = new String[3][3];
		cities[0][0] = "Ýstanbul";
		cities[0][1] = "Bursa";
		cities[0][2] = "Bilecik";
		cities[1][0] = "Ankara";
		cities[1][1] = "Konya";
		cities[1][2] = "Kayseri";
		cities[2][0] = "Diyarbakýr";
		cities[2][1] = "Þanlýurfa";
		cities[2][2] = "Gaziantep";
		
		for (int i = 0; i < 3; i++) {
			System.out.println("-------------------");
			for (int j = 0; j < 3; j++) {
				System.out.println(cities[i][j]);
			}
		}
	}
}