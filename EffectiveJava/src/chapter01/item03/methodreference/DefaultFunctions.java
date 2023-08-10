package chapter01.item03.methodreference;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctions {
	public static void main(String[] args) {
		// int를 받고 String을 리턴해주는 Function 정의할 수 있게 해주는 타겟 타입
		Function<Integer, String> intToString = Object::toString;
		
		// 받는게 없고 리턴만 있는 경우(param이 없으면서 void가 아닌 메소드)
		// 기본 생성자 참조 가능
		Supplier<Person> personSupplier = Person::new;
		Function<LocalDate, Person> personFunction = Person::new;
		
		// 받는게 있지만 리턴이 없는 경우(param이 있으며 void인 메소드)
		Consumer<Integer> integerConsumer = System.out::println;
		
		Predicate<Integer> predicate;
	}
}
