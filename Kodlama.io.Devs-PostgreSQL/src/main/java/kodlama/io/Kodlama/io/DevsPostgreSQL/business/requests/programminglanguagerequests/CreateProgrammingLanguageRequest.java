package kodlama.io.Kodlama.io.DevsPostgreSQL.business.requests.programminglanguagerequests;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor

@AllArgsConstructor

// Spn Kullanicinin Gorebilecegi Kisimleri Belirtiyoruz
public class CreateProgrammingLanguageRequest {
	
	private String programmingLanguageCreateRequestName;
	
	List<Integer> programmingLanguageTechnologyIds;
}