package hospital;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor doctor = new Doctor("Victor", "Frankenstein");
		Patient patient = new Patient("Igor", "Plotnik");
		
		System.out.printf("%s %s has rank %s\n", doctor.getFname(), doctor.getLname(), doctor.getPersonType());
		
		System.out.printf("%s %s has rank %s\n", patient.getFname(), patient.getLname(), patient.getPersonType());
		
		
	}

}
