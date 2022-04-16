public class Car extends MotorizedVehicle {
	private int odometer;

	public Car(String model, IEngine engine, IIgnition ignitionSystem) {
		super(model, engine, ignitionSystem);
	}
	
	public int getOdometer() {
		return odometer;
	}
}
