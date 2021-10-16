package builder;

public class SecuredState implements State{

	DoorKnobStates doorKnobStates;
	public SecuredState(DoorKnobStates doorKnobStates) {
		this.doorKnobStates = doorKnobStates;
	}
	

	@Override
	public void insertLatch() {
		System.out.println("Insert the latch to the door");

	}

	@Override
	public void affix() {
		System.out.println("Affix the door knob to the inserted latch");


	}

	@Override
	public void secureKnob() {
		System.out.println("secure the knob with screws and tighten the screws");


	}

	@Override
	public void test() {
		System.out.println("check the doorknob working state ");
		doorKnobStates.setState(doorKnobStates.getTestedState());

	}

	@Override
	public void refinish() {
		System.out.println("Repaint around the doorknob area if required");
		
	}
	public String toString() {
		return " secured state";
	}

}

