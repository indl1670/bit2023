package chapter01.item05.factorymethod;

import java.util.List;

import chapter01.item05.Dictionary;

public class SpellChecker {
	private Dictionary dictionary;
	
	public SpellChecker(DictionaryFactory dictionaryFactory) {
		this.dictionary = dictionaryFactory.getDictionary();
	}
	
	public boolean isValid(String word) {
		return dictionary.contains(word);
	}
	
	public List<String> suggestions(String typo) {
		return dictionary.closeWordsTo(typo);
	}

}
