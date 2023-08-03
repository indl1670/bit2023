package chapter01.item02;

import static chapter01.item02.NyPizza.Size.SMALL;
import static chapter01.item02.Pizza.Topping.*;

public class PizzaTest {

	public static void main(String[] args) {
		NyPizza pizza = new NyPizza.Builder(SMALL).
				addTopping(SAUSAGE).
				addTopping(ONION).build();
		
		System.out.println(pizza); // [ONION, SAUSAGE]로 토핑한 피자

		Calzone calzone = new Calzone.Builder().
				addTopping(HAM).sauceInside().build();
		
		System.out.println(calzone); // [HAM]로 토핑한 칼초네 피자 (소스는 안에)
	}

}
