package chapter01.item01;

import java.util.Arrays;
import java.util.EnumSet;

public class Order {

	private boolean prime;
	private boolean urgent;
	private Product product;
	private OrderStatus orderStatus;
	
//	// 생성자 1
//	public Order(Product product, boolean prime) {
//		this.product = product;
//		this.prime = prime;
//	}
//	
//	// 생성자 2 - Compile Error
//	// 동일한 시그니처 생성자 두 개 이상 불가
//	// 선언부가 동일하면 매개변수 이름과 상관없이 동일하다고 판단
//	public Order(Product product, boolean urgent) {
//		this.product = product;
//		this.urgent = urgent;
//	}
//	
//	// 생성자 2'
//	// 오류 발생 X
//	// 생성자는 고정이기 때문에 이름을 표현할 수 없음
//	public Order(boolean urgent, Product product) {
//		this.product = product;
//		this.urgent = urgent;
//	}
	
	// Static Factory Method
	public static Order primeOrder(Product product) {
		Order order = new Order();
		order.prime = true;
		order.product = product;
		return order;
	}
	
	public static Order urgentOrder(Product product) {
		Order order = new Order();
		order.urgent = true;
		order.product = product;
		return order;
	}

	public static void main(String[] args) {
		EnumSet<OrderStatus> set = EnumSet.allOf(OrderStatus.class);
		set.forEach(System.out::println);
		
//		System.out.print(Arrays.toString(OrderStatus.values()));
	}
}
