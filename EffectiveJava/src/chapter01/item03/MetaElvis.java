package chapter01.item03;

public class MetaElvis<T> {

	private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();
	
	private MetaElvis() { }
	
	// 제네릭 싱글톤 팩토리
	public static <T> MetaElvis<T> getInstance() { return (MetaElvis<T>) INSTANCE; }
	
	public void say(T t) {
		System.out.println(t);
	}
	
	public void leaveTheBuilding() {
		System.out.println("I'm out");
	}
	
	public static void main(String[] args) {
		// 인스턴스는 동일하지만 원하는 타입으로 바꿔 사용할 수 있음
		MetaElvis<String> elvis1 = MetaElvis.getInstance();
		MetaElvis<Integer> elvis2 = MetaElvis.getInstance();
		System.out.println(elvis1.equals(elvis2)); // true

	}

}
