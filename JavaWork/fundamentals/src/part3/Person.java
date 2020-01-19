package part3;

public class Person {

	int age;
	int height;
	String name;
	
	public Person() {
		this.name = "Unknown person";
	}
	
	public Person(int myAge) {
		this.age = myAge;
	}
	
	public Person(String myName) {
		this.name = myName;
	}
	
	public Person(int myAge, String myName) {
		this.age = myAge;
		this.name =  myName;
	}
	
	public void walk() {
		System.out.println("Walking ...");
	}
	
	public void walk(int speed) {
		if (speed > 10) {
			System.out.println(this.name + " is running ...");
		} else {
			System.out.println(this.name + " is walking ...");
		}
	}
	public void sleep() {
		System.out.println("Sleeping ...");
	}
	protected void takeShower() {
		System.out.println("Taking a shower");
	}
	
	
}
