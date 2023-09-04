package chapter01.item05.factorymethod;

import java.util.List;

import chapter01.item05.Dictionary;

public class DefaultDictionary implements Dictionary {

	@Override
	public boolean contains(String word) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> closeWordsTo(String typo) {
		// TODO Auto-generated method stub
		return null;
	}

}
