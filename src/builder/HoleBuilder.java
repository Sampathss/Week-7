package builder;

public class HoleBuilder extends DoorKnobBuilder {
	public HoleBuilder() {
		this.name = "make hole to fix latch";
	}

	@Override
	public DoorKnobBuilder addScrews() {
		this.tools.add("add screws");
		return this;
	}

	@Override
	public DoorKnobBuilder addLatch() {
		this.tools.add("latch");
		return this;
	}

	@Override
	public DoorKnobBuilder addDoorKnob() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public DoorKnobBuilder addDrillingMachine() {
		this.tools.add("drilling machine");
		return this;
	}

	@Override
	public DoorKnobBuilder addScrewDriver() {
		this.tools.add("Screw driver");

		return this;
	}

	@Override
	public DoorKnobBuilder addHammer() {
		this.tools.add("hammer");
		return this;
	}

	@Override
	public DoorKnobBuilder addWoodenBlock() {
		this.tools.add("wooden block");
		return this;
	}

}
