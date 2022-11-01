package kodlama.io.Kodlama.io.Devs.entities.concretes;

public class ProgrammingLanguage {
	private int id;
	private String programmingLanguageName;
	
	public ProgrammingLanguage() {
		
	}

	public ProgrammingLanguage(int id, String programmingLanguageName) {
		this.id = id;
		this.programmingLanguageName = programmingLanguageName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProgrammingLanguage() {
		return programmingLanguageName;
	}

	public void setProgrammingLanguage(String programmingLanguageName) {
		this.programmingLanguageName = programmingLanguageName;
	}
}