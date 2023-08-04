package chapter01.item03;

public class Concert {

	private boolean lightsOn;
	private boolean mainStageOpen;
	
	private IElvis elvis;
	
	public Concert(IElvis elvis) {
		this.elvis = elvis;
	}
	
	public void perform() {
		mainStageOpen = true;
		lightsOn = true;
		elvis.sing();
	}
	
	public boolean isLightsOn() {
		return lightsOn;
	}
	
	public boolean isMainStageOpen() {
		return mainStageOpen;
	}
}
