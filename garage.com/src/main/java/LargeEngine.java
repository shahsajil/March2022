public class LargeEngine implements IEngine {

	private boolean isStarted;

	public void start() {
		this.isStarted = true;
		System.out.println("Engine Started");			
	}
	
	public boolean getIsStarted() {
		return this.isStarted;
	}
}
