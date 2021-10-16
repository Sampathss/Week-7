package builder;

public class DoorKnobStates {
	State newState;
	State insertedState;
	State affixedState;
	State securedState;
	State testedState;
	State refinishState;

	State state;

	public DoorKnobStates() {
		newState= new NewState(this);
		insertedState = new InsertedState(this);
		affixedState = new AffixedState(this);
		securedState = new SecuredState(this);
		testedState = new TestedState(this);
		refinishState = new RefinishState(this);
		state = newState ;
	}
	
	public void insertLatch() {
		state.insertLatch();
	}
	public void affix() {
		state.affix();
	}
	public void secureKnob() {
		state.secureKnob();
	}
	public void test() {
		state.test();
	}
	public void refinish() {
		state.refinish();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
	public State getNewState() {
		return newState;
	}
	public State getInsertedState() {
		return insertedState;
	}
	public State getAffixedState() {
		return affixedState;
	}
	public State getSecuredState() {
		return securedState;
	}
	public State getTestedState() {
		return testedState;
	}

	public State getRefinishState() {
		return refinishState;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();

		result.append("---- Jack n Jill Classic DoorKnobs ------");

		result.append("\nDoorknob is " + state + "\n");

		return result.toString();
	}

}


