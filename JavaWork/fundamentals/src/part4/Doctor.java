package part4;

public class Doctor implements PersonBehaviour, PersonListener {

	// I can avoid implementing a method if I use the Override annotation.
	@Override
	public void breathe() {
		
	}
	
	@Override
	public void sleep() {
		System.out.println("The doctor is asleep");
		this.onPersonSleeping();
	}
	
	@Override
	public void walk(int speed) {
		if (speed > 4) {
			System.out.println("The doctor is running");
		} else {
			System.out.println("The doctor is walking");
		}
		this.onPersonWalking();
	}
	
	@Override
	public void onPersonWalking() {
		System.out.println("Event: onPersonWalking");
	}
	
	@Override
	public void onPersonSleeping() {
		System.out.println("Event: onPersonSleeping");
	}
	
}
