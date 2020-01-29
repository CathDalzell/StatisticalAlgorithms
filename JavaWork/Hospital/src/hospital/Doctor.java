package hospital;

public class Doctor extends Person {
	
	public Doctor(String fname, String lname) {
		super(fname, lname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPersonType() {
		return "Artz";
	}

}
