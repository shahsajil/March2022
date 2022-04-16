
public class ElectronicIgnition implements IIgnition {

	private boolean IsOn;

	public void turnOn() {
		this.IsOn = true;		
	}

	public boolean getIsOn() {
		return this.IsOn;
	}
}
