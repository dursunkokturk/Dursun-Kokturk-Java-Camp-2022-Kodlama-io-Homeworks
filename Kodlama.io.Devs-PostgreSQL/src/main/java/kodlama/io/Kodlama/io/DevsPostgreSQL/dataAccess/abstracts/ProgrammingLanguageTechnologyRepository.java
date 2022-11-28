package kodlama.io.Kodlama.io.DevsPostgreSQL.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.DevsPostgreSQL.entities.concretes.ProgrammingLanguageTechnology;

@Repository

//Ekleme Silme Guncelleme Listeleme Gibi Bir Cok Fonksiyon (Method) JpsRepository Icinde Yer Almaktadir
public interface ProgrammingLanguageTechnologyRepository extends JpaRepository<ProgrammingLanguageTechnology,Integer>{
	
}