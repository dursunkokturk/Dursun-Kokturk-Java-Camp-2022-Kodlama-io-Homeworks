package kodlama.io.Kodlama.io.DevsPostgreSQL.business.responses.programminglanguagetechnologyresponses;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor

@AllArgsConstructor

public class ProgrammingLanguageTechnologyListResponse {
	
	private int id;
	private String programmingLanguageTechnologyListResponseName;
	
	private List<ProgrammingLanguageTechnologyListResponse> programmingLanguageTechnology;
}