package builder;

public class AffixBuilder extends DoorKnobBuilder {
		public AffixBuilder() {
			this.name = "affix knob to the latch";
		}

		@Override
		public DoorKnobBuilder addScrews() {
			this.tools.add("add screws");
			return this;
		}

		@Override
		public DoorKnobBuilder addLatch() {
			
			return this;
		}

		@Override
		public DoorKnobBuilder addDoorKnob() {
			this.tools.add("add doorknob");

			return this;
		}

		@Override
		public DoorKnobBuilder addDrillingMachine() {
			return this;
		}

		@Override
		public DoorKnobBuilder addScrewDriver() {
			this.tools.add("Screw driver");

			return this;
		}

		@Override
		public DoorKnobBuilder addHammer() {
			this.tools.add("add hammer");
			return this;
		}

		@Override
		public DoorKnobBuilder addWoodenBlock() {
			this.tools.add("add wooden block");
			return this;
		}

	
}
