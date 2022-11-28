package kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguageresponses;

import java.util.List;

import kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguagetechnologyresponses.ProgrammingLanguageTechnologyListResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor

@AllArgsConstructor

public class ProgrammingLanguageListResponse {
	private int id;
	private String programmingLanguageListResponseName;
	List<ProgrammingLanguageTechnologyListResponse> programmingTechnologyListResponse;
}