package chapter01.item01;

public interface HelloService {
	// 인터페이스는 자동 public
	String hello();
	
	// 정적 메서드
	// 인스턴스 없이 호출 가능
	static String hi() {
		return "hi";
	}
	
	// 메서드 정의 시 'default' 키워드 필수
	// instance에서만 호출 가능
	default String bye() {
		return "bye";
	}
}
