package kodlama.io.Kodlama.io.DevsPostgreSQL.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.DevsPostgreSQL.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.requests.programminglanguagerequests.CreateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.requests.programminglanguagerequests.UpdateProgrammingLanguageRequest;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguageresponses.ProgrammingLanguageDeleteResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguageresponses.ProgrammingLanguageListResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguageresponses.ProgrammingLanguageResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguageresponses.UpdateProgrammingLanguageResponse;

@RestController
@RequestMapping("/api/programminglanguage")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;
	
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@PostMapping("/add")
	public ProgrammingLanguageResponse add(@RequestBody CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		return this.programmingLanguageService.saveProgrammingLanguaqge(createProgrammingLanguageRequest);
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguageListResponse> getAll(){
		return this.programmingLanguageService.getAll();
	}
	
	@DeleteMapping("/delete")
	public ProgrammingLanguageDeleteResponse delete(@RequestParam int id) {
		return this.programmingLanguageService.deleteProgrammingLanguaqge(id);
	}
	
	@PutMapping("/update")
	public UpdateProgrammingLanguageResponse update(@RequestParam int id, @RequestBody UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
		return this.programmingLanguageService.updateProgrammingLanguaqge(id, updateProgrammingLanguageRequest);
	}
	
	@GetMapping("/getById")
	public ProgrammingLanguageResponse getById(@RequestParam int id) {
		return this.programmingLanguageService.getById(id);
	}

}