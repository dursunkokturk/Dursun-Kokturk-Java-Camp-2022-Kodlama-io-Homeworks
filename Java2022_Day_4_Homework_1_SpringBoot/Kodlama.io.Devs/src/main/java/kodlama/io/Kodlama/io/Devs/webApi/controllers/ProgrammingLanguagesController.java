package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController

@RequestMapping("/api/programminglanguage")

public class ProgrammingLanguagesController {
	
	private ProgrammingLanguageService programmingLanguageService;
	
	@Autowired
	
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@PostMapping("/saveProgrammingLanguage")
	public void saveProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.saveLanguage(programmingLanguage);
	}

	@PostMapping("/deleteProgrammingLanguage")
	public void deleteProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.deleteLanguage(programmingLanguage);
	}
	
	@PostMapping("/updateProgrammingLanguage")
	public void updateProgrammingLanguage(ProgrammingLanguage programmingLanguage, String updatedName) {
		programmingLanguageService.updateLanguage(programmingLanguage,updatedName);
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return programmingLanguageService.getAll();
	}
	
	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(int id) {
		return programmingLanguageService.getById(id);
	}
}