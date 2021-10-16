package builder;

public class NewState implements State {
	DoorKnobStates doorKnobStates;
	public NewState(DoorKnobStates doorKnobStates) {
		this.doorKnobStates = doorKnobStates;
	}
	

	@Override
	public void insertLatch() {
		DoorKnobBuilder HoleBuilder = new HoleBuilder();
		DoorKnob knob = HoleBuilder.addDrillingMachine().addLatch().addScrews().addScrewDriver().addWoodenBlock().addHammer().addDoorKnob().build();
		knob.marking();
		knob.makeHole();
		knob.affixKnob();
		knob.test();
	

		System.out.println(knob);


		System.out.println("Insert the latch to the door");
		doorKnobStates.setState(doorKnobStates.getInsertedState());
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
	}

	@Override
	public void refinish() {
		System.out.println("Repaint around the doorknob area if required");
		
	}
	public String toString() {
		return " new state";
	}


	
}
