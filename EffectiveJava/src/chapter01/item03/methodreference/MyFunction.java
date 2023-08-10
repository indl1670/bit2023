package chapter01.item03.methodreference;

@FunctionalInterface
public interface MyFunction {
	// Impl이 비어 있는 메소드 선언은 오직 하나만 가능
	String valueOf(Integer integer);
	
	static String hello() {
		return "hello";
	}
}
