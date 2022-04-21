import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConvertibleCarTests {
	private ConvertibleCar Car;

	@BeforeClass
	public void setup() {
		String model = "Miata";
		IEngine engine = new SmallEngine();
		IIgnition ignitionSystem = new ElectronicIgnition();

		this.Car = new ConvertibleCar(model, engine, ignitionSystem);
	}

	@Test
	public void canBuildConvertibleCar() {
		ConvertibleCar car = this.Car;

		String actualModel = car.getModel();

		assertEquals(actualModel, Car.getModel() , "The car model should be Miata.");
	}

	@Test
	public void canStartConvertibleCar() {
		ConvertibleCar car = this.Car;
		car.start();

		boolean isStarted = car.getIsStarted();

		assertTrue(isStarted, "The car should start");
	}

	@Test
	public void canLowerTop() {
		ConvertibleCar car1 = this.Car;
		car1.lowerTop();

		boolean isLowerTop = car1.lowerTop();

		assertTrue(isLowerTop, "The car1 can be LowerTop");
	}

	@Test
	public void canRaiseTop() {
		ConvertibleCar car2 = this.Car;
		car2.raiseTop();

		boolean isRaiseTop = car2.raiseTop();

		assertTrue(isRaiseTop,"The car2 can be RaiseTop");
	}
}
