package chapter01.item01;

public enum OrderStatus {
	// DB에 숫자 형태로 저장하고 싶은 경우
	PREPARING(0), SHIPPED(1), DELIVERING(2), DELIVERED(3);
	
	// enum도 생성자, 메소드, 필드 가질 수 있음
	private int number;
	
	OrderStatus(int number) {
		this.number = number;
	}
}
