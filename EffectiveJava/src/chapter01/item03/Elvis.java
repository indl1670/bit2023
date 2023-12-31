package chapter01.item03;

import java.io.Serializable;

public class Elvis implements Singer{

	public static final Elvis INSTANCE = new Elvis();	
	private Elvis() {}
	
	public static Elvis getInstance() {
		return INSTANCE;
	}
	
	public void leaveTheBuilding() {
		System.out.println("I'm out");
	}
	
	@Override
	public void sing() {
		System.out.println("singing");
		
	}
	
	public static void main(String[] args) {
		Elvis elvis = Elvis.getInstance();
		elvis.leaveTheBuilding();
	}
	
}
