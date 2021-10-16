package builder;

public class AffixedState implements State{

	DoorKnobStates doorKnobStates;
	public AffixedState(DoorKnobStates doorKnobStates) {
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
		doorKnobStates.setState(doorKnobStates.getSecuredState());

	}

	@Override
	public void test() {
		System.out.println("check the doorknob working state ");
	}

	@Override
	public void refinish() {
		System.out.println("Repaint around the doorknob area if required");
		
	}
	public String toString() {
		return " affixed state";
	}

}
