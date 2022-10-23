-- Database Icindeki Musteriler Tablosundaki Tum Kolonlari Secmek Icin 
select * from Customers





-- Database Icindeki Tek Bir Kolon Secilebilecegi Gibi Birden Fazla Kolon Secilebilir
select ContactName,CompanyName,City from Customers





-- Database Icindeki Kolon Isimlerini Gecici Olarak Farkli Bir Isim Ile Gormek Icin
-- Kolon Adindan Sonra Gorulmek Istenilen Adini Yaziyoruz.
select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers





-- Customers Tablosu Icindeki City Kolonunda London Olanlari Gosteriyor
select * from Customers where City = 'London'





-- Products Tablosu Icindeki CategoryID Kolonunda 1 Olanlari Gosteriyor
select * from Products where CategoryID = 1





-- Products Tablosu Icindeki CategoryID Kolonunda 1 ve 3 Olanlari Gosteriyor
select * from Products where CategoryId = 1 or CategoryID = 3





-- Products Tablosu Icindeki CategoryID Kolonunda 1 Olanlari 
-- Ve Birim Fiyati 10 ve Ustu Olanlari Gosteriyor
select * from Products where CategoryId = 1 and UnitPrice >= 10





-- Products Tablosu Icindeki ProductName Kolonunda Olanlari 
-- A dan Z ye Siralama Yaptiktan Sonra Gosteriyor
select * from Products order by ProductName





-- Products Tablosu Icindeki CategoryID Kolonunda Olanlari 
-- 1 den Baslayarak Artan Sekilde Siralama Yaptiktan Sonra Gosteriyor
select * from Products order by CategoryID





-- Products Tablosu Icindeki CategoryID Kolonunda Olanlari 
-- 1 den Baslayarak Artan Sekilde Siralama Yaptiktan Sonra 
-- CategoryID ye Gore Yapilan Siralama Isleminden Sonra Siralanmis Listede Bir De
-- ProductName Kolonunda A dan Z ye Siralama Yapiyor ve Sonucu Gosteriyor
select * from Products order by CategoryID,ProductName





-- Products Tablosu Icindeki UnitPrice Kolonunda Olanlari 
-- 1 den Baslayarak Artan Sekilde Siralama Yaptiktan Sonra Gosteriyor
select * from Products order by UnitPrice





-- Products Tablosu Icindeki UnitPrice Kolonunda Olanlari 
-- En Ustten Baslayarak Azalan Sekilde Siralama Yaptiktan Sonra Gosteriyor
select * from Products order by UnitPrice desc





-- Products Tablosu Icindeki CategoryID Kolonunda 1 Olanlari 
-- 1 den Baslayarak Artan Sekilde Siralama Yaptiktan Sonra 
-- CategoryID ye Gore Yapilan Siralama Isleminden Sonra Siralanmis Listede Bir De
-- UnitPrice Kolonunda Z den Z ya Siralama Yapiyor ve Sonucu Gosteriyor
select * from Products where CategoryID = 1 order by UnitPrice desc





-- Products Tablosu Icindeki ProductName Kolonundaki 
-- Toplam Urun Sayisini Ogreniyoruz
select count(*) from Products





-- Products Tablosu Icindeki CategoryID Kolonunda 
-- CategoryID si 2 Olan Urunlerin Toplam Sayisini Ogreniyoruz
-- Count Kullanilarak Sorgulama Yaparken Tek Kolon Uzerinden Yapimasi Gerekiyor
select count(*) from Products where CategoryID = 2





-- Products Tablosu Icindeki CategoryID Kolonunda 
-- Kac Farkli Kategori Oldugunu Ogreniyoruz
-- group by Komutu Kullanilirken Komutun Sag Tarafinda 
-- Yazilan Hangi Kolon Adi Ise
-- Select Komutundan Sonra Yazilan Kolon Adi Sag Taraftaki 
-- Ile Baglantili Olmasi Gerekiyor
select CategoryID from Products group by CategoryID





-- Products Tablosu Icindeki CategoryID Kolonuna Bakilarak 
-- Hangi Kategori Icinde Kac Tane Urun Oldugunu Ogreniyoruz
-- group by Komutu Kullanilirken Komutun Sag Tarafinda Yazilan Hangi Kolon Adi Ise
-- Select Komutundan Sonra Yazilan Kolon Adi Sag Taraftaki Ile Baglantili Olmasi Gerekiyor
-- Select Komutundan Sonra Kolon Adi Yazilmis Ise Sonrasinda Count Komutu Kullanilabilir
select CategoryID,count(*) from Products group by CategoryID





-- Products Tablosu Icindeki CategoryID Kolonuna Bakilarak 
-- Icinde 10 Tanaden Az Urun Olan Kategori Ogreniyoruz
-- group by Komutu Kullanilirken Komutun Sag Tarafinda 
-- Yazilan Hangi Kolon Adi Ise
-- Select Komutundan Sonra Yazilan Kolon Adi Sag Taraftaki 
-- Ile Baglantili Olmasi Gerekiyor
-- Select Komutundan Sonra Kolon Adi Yazilmis Ise 
-- Sonrasinda Count Komutu Kullanilabilir
select CategoryID,count(*) from Products 
group by CategoryID having count(*) < 10





-- Products Tablosu Icindeki Birim Fiyati 20 den Fazla Olan Urunleri 
-- CategoryID Kolonuna Bakilarak Gruplama Islemini Yapiyoruz
-- Gruplanan Kategoriler Icinde 10 Taneden Az Urun Olan Kategorileri Ogreniyoruz
-- group by Komutu Kullanilirken Komutun Sag Tarafinda Yazilan Hangi Kolon Adi Ise
-- Select Komutundan Sonra Yazilan Kolon Adi Sag Taraftaki Ile Baglantili Olmasi Gerekiyor
-- Select Komutundan Sonra Kolon Adi Yazilmis Ise Sonrasinda Count Komutu Kullanilabilir
select CategoryID,count(*) from Products 
where UnitPrice > 20 group by CategoryID having count(*) < 10





-- Products Tablosu Icindeki Urunleri Kategorilere Gore Birlestirmek Icin
-- CategoryID Kolonu Ile 
-- Categories Tablosu Icindeki Id ler Arasinda 
-- Birbirine Esit Olanlari Goruyoruz
select * from Products inner join Categories 
on Products.CategoryID = Categories.CategoryID





-- Products Tablosu Icindeki Urunleri Product Tablosundan 
-- ProductID, ProductName, UnitPrice Kategorileri 
-- Categories Tablosundan CategoryName Kolunundaki 
-- Kategorilere Gore Birlestirmek Icin
-- CategoryID Kolonu Ile 
-- Categories Tablosu Icindeki Id ler Arasinda 
-- Birbirine Esit Olanlari Goruyoruz
select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName 
from Products inner join Categories 
on Products.CategoryID = Categories.CategoryID





-- Products Tablosu Icindeki Urunleri Product Tablosundan 
-- ProductID, ProductName, UnitPrice Kategorileri 
-- Categories Tablosundan CategoryName Kolunundaki 
-- Kategorilere Gore Fiyati 10 dan Buyuk Olanlar Ile Birlestirmek Icin
-- CategoryID Kolonu Ile 
-- Categories Tablosu Icindeki Id ler Arasinda 
-- Birbirine Esit Olanlari Goruyoruz
-- Inner Join Kullanimi Bakilmasi Gereken Tablolarda Sadece Birbiri Ile Eslesen Verileri Getirir
-- Join Kullanilan Sorgualama Islemlerinde * Ile Baslanmalidir
select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName 
from Products inner join Categories 
on Products.CategoryID = Categories.CategoryID 
where Products.UnitPrice > 10





-- Products Tablosu Icindeki Urunlerin Siparis Detaylarini Product Tablosundan 
-- ProductID Ve Order Details Tablosundaki ProductID Tablolarindaki 
-- Eslesen Urunleri Birlestiriyoruz
-- Birbirine Esit Olanlari Goruyoruz
-- Inner Join Kullanimi Bakilmasi Gereken Tablolarda Sadece 
-- Birbiri Ile Eslesen Verileri Getirir
-- Join Kullanilan Sorgualama Islemlerinde * Ile Baslanmalidir
select * from Products p inner join [Order Details] od 
on p.ProductID = od.ProductID





-- Products Tablosu Icinde Olan Urunler Arasinda 
-- Siparis Verilmemis Urunleri Dahil Ederek Product Tablosundan 
-- ProductID Ve Order Details Tablosundaki 
-- ProductID Tablolarindaki Eslesen Urunleri Birlestiriyoruz
-- Birbirine Esit Olanlari Goruyoruz
-- Inner Join Kullanimi Bakilmasi Gereken Tablolarda Sadece 
-- Birbiri Ile Eslesen Verileri Getirir
-- Join Kullanilan Sorgualama Islemlerinde * Ile Baslanmalidir
select * from Products p left join [Order Details] od on p.ProductID = od.ProductID





-- Customers Tablosu Icinde Olan Musteriler Arasinda 
-- Siparis Vermemis Musterileri Dahil Ederek Customers Tablosundan 
-- CustomerID Ve Order Tablosundaki CustomerID 
-- Tablolarindaki Eslesen Urunleri Birlestiriyoruz
-- Birbirine Esit Olanlari Goruyoruz
-- Inner Join Kullanimi Bakilmasi Gereken Tablolarda Sadece 
-- Birbiri Ile Eslesen Verileri Getirir
-- Join Kullanilan Sorgualama Islemlerinde * Ile Baslanmalidir
select * from Customers c left join Orders o on c.CustomerID = o.CustomerID





-- Customers Tablosu Icinde Olan Musteriler Arasinda 
-- Hic Siparis Vermemis Musterileri (Hic Siparis Vermeyen Musteri Icin Null Kullanilir)
-- Null Kullanilmasinin Sebebi Hic Siparis Vermemis Musterinin Database Icinde 
-- Order Colonunda Siparis Detayi Olarak Null Yazmasindan DOlayidir.
-- Siparis Verildigi Anda Null Yazan Yerde Siparis Numarasi Yazar
-- Dahil Ederek Customers Tablosundan 
-- CustomerID Ve Order Tablosundaki CustomerID Tablolarindaki Eslesen Urunleri Birlestiriyoruz
-- Birbirine Esit Olanlari Goruyoruz
-- Inner Join Kullanimi Bakilmasi Gereken Tablolarda Sadece Birbiri Ile Eslesen Verileri Getirir
-- Join Kullanilan Sorgualama Islemlerinde * Ile Baslanmalidir
select * from Customers c left join Orders o on c.CustomerID = o.CustomerID 
where o.CustomerID is null





-- Iki den Fazla Tablo Ile Join Islemi Yapmak Icin 
-- Sql Sorgulama Komutundan Sonra 
-- Inner Join Kullanilarak Istenildigi Kadar Tablo Isleme Dahil Edilebilir
-- Products Tablosu Icinde Olan Urunler Arasinda 
-- Siparis Verilmemis Urunleri Dahil Ederek Product Tablosundan 
-- ProductID Ve Order Details Tablosundaki ProductID Tablolarindaki 
-- Eslesen Urunleri Birlestiriyoruz
-- Bir de Order Details Tablosundaki OrderID Kolonu Ile Orders Tablosundaki 
-- OrdersID Kolonunu Birlestiriyoruz
-- Birbirine Esit Olanlari Goruyoruz
-- Inner Join Kullanimi Bakilmasi Gereken Tablolarda Sadece 
-- Birbiri Ile Eslesen Verileri Getirir
-- Join Kullanilan Sorgualama Islemlerinde * Ile Baslanmalidir
select * from Products p inner join [Order Details] od 
on p.ProductID = od.ProductID inner join orders o 
on o.OrderID = od.OrderID