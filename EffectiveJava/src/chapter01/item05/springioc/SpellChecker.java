package chapter01.item05.springioc;

import java.util.List;

import chapter01.item05.Dictionary;

public class SpellChecker {

	private Dictionary dictionary;
	
	SpellChecker(Dictionary dictionary) {
		this.dictionary = dictionary;
	}
	
	public boolean isValid(String word) {
		return dictionary.contains(word);
	}
	
	public List<String> suggestions(String typo) {
		return dictionary.closeWordsTo(typo);
	}
}
