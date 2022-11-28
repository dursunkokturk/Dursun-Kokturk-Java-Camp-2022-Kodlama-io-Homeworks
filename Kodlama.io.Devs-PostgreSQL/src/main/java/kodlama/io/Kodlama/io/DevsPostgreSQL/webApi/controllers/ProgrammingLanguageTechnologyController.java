package kodlama.io.Kodlama.io.DevsPostgreSQL.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.DevsPostgreSQL.business.abstracts.ProgrammingLanguageTechnologyService;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.requests.programminglanguagetechnologyrequests.CreateProgrammingLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.requests.programminglanguagetechnologyrequests.UpdateProgrammingLanguageTechnologyRequest;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguagetechnologyresponses.ProgrammingLanguageTechnologyDeleteResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguagetechnologyresponses.ProgrammingLanguageTechnologyListResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguagetechnologyresponses.ProgrammingLanguageTechnologyResponse;
import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguagetechnologyresponses.UpdateProgrammingLanguageTechnologyResponse;

@RestController

@RequestMapping("/programminglanguagetechnology")
public class ProgrammingLanguageTechnologyController {
	private ProgrammingLanguageTechnologyService programmingLanguageTechnologyService;
	
	@Autowired
	public ProgrammingLanguageTechnologyController(ProgrammingLanguageTechnologyService programmingLanguageTechnologyService) {
		this.programmingLanguageTechnologyService = programmingLanguageTechnologyService;
	}
	
	@PostMapping("/add")
	public ProgrammingLanguageTechnologyResponse add(@RequestBody CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnologyRequest) {
		return this.programmingLanguageTechnologyService.saveProgrammingLanguaqgeTechnology(createProgrammingLanguageTechnologyRequest);
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguageTechnologyListResponse> getAll(){
		return this.programmingLanguageTechnologyService.getAll();
	}
	@DeleteMapping("/delete")
	public ProgrammingLanguageTechnologyDeleteResponse delete(@RequestParam int id) {
		return this.programmingLanguageTechnologyService.deleteProgrammingLanguaqgeTechnology(id);
	}
	
	@PutMapping("/update")
	public UpdateProgrammingLanguageTechnologyResponse update(@RequestParam int id, @RequestBody UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologyRequest) {
		return this.programmingLanguageTechnologyService.updateProgrammingLanguaqgeTechnology(id, updateProgrammingLanguageTechnologyRequest);
	}
	
	@GetMapping("/getById")
	public ProgrammingLanguageTechnologyResponse getById(@RequestParam int id) {
		return this.programmingLanguageTechnologyService.getById(id);
	}
}