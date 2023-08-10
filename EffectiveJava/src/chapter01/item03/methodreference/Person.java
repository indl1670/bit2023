package chapter01.item03.methodreference;

import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Person {
	LocalDate birthday;
	
	public int compareByAge(Person b) {
		// 자기 자신과 비교
		return this.birthday.compareTo(b.birthday);
	}
	
	public Person() { }
	
	public Person(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	public static void main(String[] args) {
		List<LocalDate> dates = new ArrayList<>();
		dates.add(LocalDate.of(1982, 7, 26));
		dates.add(LocalDate.of(1982, 7, 26));
		dates.add(LocalDate.of(1982, 7, 26));
		
		// 생성자 레퍼런스
		// Before
		dates.stream().map(d -> {
			return new Person(d);
		}).collect(Collectors.toList());
		
		// After
		dates.stream().map(Person::new).collect(Collectors.toList());
		
		List<Person> people = new ArrayList<>();
		people.add(new Person(LocalDate.of(1982, 7, 26)));
		people.add(new Person(LocalDate.of(2011, 3, 2)));
		people.add(new Person(LocalDate.of(2013, 1, 20)));
		
		// Comparator와 호환 가능
		people.sort(Person::compareByAge);
		
		Comparator<Person> compareByAge = Person::compareByAge;
		people.sort(compareByAge);
	}
	
	public int getAge() {
		return LocalDate.now().getYear() - birthday.getYear();
	}

}
