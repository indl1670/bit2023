package chapter01.item01;

import java.util.*;
import java.util.Comparator;

public class ListQuiz {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(100);
		numbers.add(20);
		numbers.add(44);
		
		System.out.println(numbers);
		
		Comparator<Integer> desc = (o1, o2) -> o2 - o1;
		
		numbers.sort(desc); // 내림차순
		System.out.println(numbers);
		
		numbers.sort(desc.reversed()); // 오름차순
		System.out.println(numbers);
	}

}
