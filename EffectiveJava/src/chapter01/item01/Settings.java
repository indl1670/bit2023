package chapter01.item01;

/**
 * @author yun
 * 이 클래스의 인스턴스는 #getInstance()를 통해 사용한다.
 * @see #getInstance()
 *
 */
public class Settings {
	
	private boolean useAutoSteering;
	private boolean useABS;
	private Difficulty difficulty;
	
	// 외부에서 호출 불가능한 생성자
	private Settings() {}
	
	private static final Settings SETTINGS = new Settings();
	
	// Static Factory Method - 미리 생성해놓은 인스턴스 리턴
	// 외부에서는 오직 Static Factory Method에서만 인스턴스를 생성할 수 있음
	public static Settings getInstance() {
		return SETTINGS;
	}
	
	public static void main(String[] args) {
		// 매번 다른 인스턴스 생성 -> 통제 불가능
		System.out.println(new Settings()); // chapter01.item01.Settings@182decdb
		System.out.println(new Settings()); // chapter01.item01.Settings@7637f22
		System.out.println(new Settings()); // chapter01.item01.Settings@4926097b

		// 하나의 인스턴스만 생성
		System.out.println(getInstance()); // chapter01.item01.Settings@762efe5d
		System.out.println(getInstance()); // chapter01.item01.Settings@762efe5d
		System.out.println(getInstance()); // chapter01.item01.Settings@762efe5d
	}

}
