package chapter01.item05.springioc;

import java.util.List;

import chapter01.item05.Dictionary;

public class SpringDictionary implements Dictionary {

	@Override
	public boolean contains(String word) {
		System.out.println("contains" + word);
		return false;
	}

	@Override
	public List<String> closeWordsTo(String typo) {
		// TODO Auto-generated method stub
		return null;
	}

}
