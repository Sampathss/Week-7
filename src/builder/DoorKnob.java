package builder;

import java.util.List;

public class DoorKnob {

	String name;
	List<String> tools ;
	public void addTools(List<String> tools) {
		this.tools = tools;
	}

	void install() {
		System.out.println("Install " + name );
		System.out.println("collect tools");
		for(String tool : tools) {
			System.out.println("   " + tool);
		}

	}
	void marking() {
		System.out.println("mark the area on door where knob is to be placed\n");
	}
	void makeHole() {
		System.out.println("make a hole of required diameter to fix the latch, insert screws in the holes of the latch and with the help of the screw driver tighten the screws");
	}
	void affixKnob() {
		System.out.println("insert the knob and fix in the latch, place wooden block to fix the screws firmly");
	}
	void test() {
		System.out.println("test the working of the knob and ready to use ");
	}
	public void setName(String name ) {
		this.name = name;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("----" + this.name + "-----");
		for(String tool: tools) {
			display.append(tool + "\n");
		}
		return display.toString();
	}
}


