package builder;

public class DoorKnobBuilderDemo {
	public static void main(String[] args) {
		DoorKnobStates states = new DoorKnobStates();

		System.out.println(states);
		states.insertLatch();
		System.out.println(states);
		states.affix();
		System.out.println(states);
		states.secureKnob();
		System.out.println(states);

		states.test();

		System.out.println(states);


		states.refinish();
		System.out.println(states);
	
	}


}
