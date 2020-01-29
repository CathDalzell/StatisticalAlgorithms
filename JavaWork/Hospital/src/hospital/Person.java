
package hospital;

public abstract class Person {
	// an abstract class that cannot be instantiated
	
	private String fname;
	private String lname;
	
	public Person(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getFname() {
		return this.fname;
	}
	
	public String getLname() {
		return this.lname;
	}
	public abstract String getPersonType();
}
