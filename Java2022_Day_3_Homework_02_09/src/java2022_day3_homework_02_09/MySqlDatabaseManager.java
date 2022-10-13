package java2022_day3_homework_02_09;

//Temel Class tan Inheritance Yaparak
//Temel Class Icindeki Fonksiyon Ve Islemleri 
//Bulunulan Class Icinden Yapilabilir Hale Getiriyoruz
public class MySqlDatabaseManager extends BaseDatabaseManager{

	@Override
	public void getData() {
		System.out.println("MySQL Server Database Datas");
	}
}