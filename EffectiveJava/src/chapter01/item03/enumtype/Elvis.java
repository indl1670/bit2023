package chapter01.item03.enumtype;

public enum Elvis {
	INSTANCE;
	
	public void leaveTheBuilding() {
		System.out.println("I'm out");
	}
	
	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}
}
