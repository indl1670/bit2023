package chapter01.item03;

import java.io.Serializable;

public class Elvis implements IElvis, Serializable {

	/**
	 * Singleton Object
	 */
	public static final Elvis INSTANCE = new Elvis();
	private static boolean created;
	
	private Elvis() {}
	
//	private Elvis() {
//		if (created) {
//			throw new UnsupportedOperationException("can't be created by constructor");
//		}
//		
//		created = true;
//	}

	@Override
	public void leaveTheBuilding() {
		System.out.println("I'm out");
		
	}
	
	public void sing() {
		System.out.println("I'm singing~");
	}
	
	// 외부 호출 가정
	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();

	}
	
	private Object readResolve() {
		return INSTANCE;
	}

}
