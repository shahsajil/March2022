import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CarTests {

	@Test
	public void canBuildCar() {
		boolean expectedStartedStatus = true;
		String model = "Corvette";
		Car myCar = new Car(model);

		myCar.start();
		boolean isStarted = myCar.getIsStarted();

		assertEquals(isStarted, expectedStartedStatus);
	}
}
