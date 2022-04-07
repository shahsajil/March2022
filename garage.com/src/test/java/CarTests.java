import org.testng.annotations.Test;

import garage.com.Car;

public class CarTests {
	
  @Test
  public void canBuildCar() {
	  String model = "Corvette";
	  Car myCar = new Car(model);
	  
	  myCar.startEngine();	  
  }
}
