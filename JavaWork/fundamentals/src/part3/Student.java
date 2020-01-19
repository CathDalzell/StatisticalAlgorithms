package part3;

public class Student extends Person {
	
	public Student(String name) {
		super(name);
	}
	
	public Student() {
		super("some student");
	}
	
	public void study() {
		System.out.println(this.name + " is studying ...");
	}
}
