package hospital;

public class Patient extends Person {
		
	
	public Patient(String fname, String lname){
		super(fname, lname);
		
	}
	@Override
	public String getPersonType() {
		return "Kranke";
	}
}
