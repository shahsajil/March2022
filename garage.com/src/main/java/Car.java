public class Car {
	private int odometer;
	private LargeEngine engine;

	public Car(String model) {
		this.engine = new LargeEngine();
	}

	public void start() {
		this.engine.start();
	}

	public int getOdometer() {
		return odometer;
	}

	public boolean getIsStarted() {
		return this.engine.getIsStarted();
	}
}
