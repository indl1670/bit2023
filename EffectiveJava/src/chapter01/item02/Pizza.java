package chapter01.item02;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

	public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
	final Set<Topping> toppings;
	
	// 추상 빌더 - 재귀적 타입 제한 사용
	abstract static class Builder<T extends Builder<T>> {
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
		
		// 'this'를 사용해 빌더 타입 자체를 리턴할 경우 별도의 타입 캐스팅이 필요함
		// 하위 빌더 사용 X
		public T addTopping(Topping topping) {
			toppings.add(Objects.requireNonNull(topping));
			return self(); // 상속 구조이므로 하위 타입을 리턴할 수 있게 'this'가 아닌 'self' 리턴
		}
		
		abstract Pizza build();
		
		protected abstract T self();
	}
	Pizza(Builder<?> builder) {
		toppings = builder.toppings.clone();
	}
}
