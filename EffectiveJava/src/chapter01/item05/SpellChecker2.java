package chapter01.item05;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker2 {
	private final Dictionary dictionary;
	
	// 의존성 주입 생성
	// Dictionary가 인터페이스 였을 때
	// Dictionary가 바뀐다고 하더라도 모든 메소드 재사용 가능
	public SpellChecker2(Dictionary dictionary) {
		this.dictionary = dictionary;
	}
	
	public SpellChecker2(Supplier<Dictionary> dictionarySupplier) {
		this.dictionary = dictionarySupplier.get();
	}
	
	public static boolean isValid(String word) {
		return dictionary.contains(word);
	}
	
	public static List<String> suggestions(String typo) {
		return dictionary.closeWordsTo(typo);
	}
}
