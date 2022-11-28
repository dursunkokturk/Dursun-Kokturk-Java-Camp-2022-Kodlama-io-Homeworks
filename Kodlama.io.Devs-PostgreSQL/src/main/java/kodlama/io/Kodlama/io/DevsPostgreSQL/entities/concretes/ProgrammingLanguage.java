package kodlama.io.Kodlama.io.DevsPostgreSQL.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor

@AllArgsConstructor

@Entity

@Table(name="programming_languages")

public class ProgrammingLanguage {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	// Database Icinde language_id Column Ile Eslestirme Yapiyoruz
	@Column(name="programming_language_id")
	private int programmingLanguageId;
	
	// Database Icinde language_name Column Ile Eslestirme Yapiyoruz
	@Column(name="programming_language_name")
	private String programmingLanguageName;
	
	// Programmlama Dilleri Ile Alt Teknolojileri
	// OneToMany Kullanarak Birbirine Bagliyoruz
	@OneToMany
	
	//private String programmingLanguageTechnologyName;
	private List<ProgrammingLanguageTechnology> programmingLanguageTechnlology;
}