package part3;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person me =  new Person("Catherine");
		Person myNeighbour = new Person();
		
		Person lecturer = new Person();
		
		Student bob = new Student();
		
		me.takeShower();
		myNeighbour.sleep();
		lecturer.walk(3);
		me.walk(15);
		bob.study();

	}

}
