package java2022_day1_homework_09;

public class Main {

	public static void main(String[] args) {
		
		// Do - While Dongusu Ile Calismak
		// Server Baglantisi Gerektiren Durumlarda 
		// Server a Erisim Saglanma Kontrolu Icin Kullanilabilir
		int i = 0;
		
		do{
			System.out.println(i);
			i++;
		}
		while(i<10);
		
		System.out.println("Enf Of While");
		
		System.out.println("");
		
		int a = 2;
		do{
			System.out.println(a);
			a+=2;
		}
		while(a<10);
		
		System.out.println("Enf Of While");
	}
}