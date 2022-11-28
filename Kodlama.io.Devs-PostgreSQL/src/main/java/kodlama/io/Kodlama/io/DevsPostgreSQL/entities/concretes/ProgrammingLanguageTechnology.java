package kodlama.io.Kodlama.io.DevsPostgreSQL.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor

@AllArgsConstructor

@Entity

@Table(name="programming_language_teknology_name")

public class ProgrammingLanguageTechnology {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	// Database Icinde technology_id Column Ile Eslestirme Yapiyoruz
	@Column(name="programming_language_technology_id")
	private int programmingLanguageTechnologyId;
	
	// Database Icinde technology_name Column Ile Eslestirme Yapiyoruz
	@Column(name="programming_language_technology_name")
	private String programmingLanguageTechnologyName;
}