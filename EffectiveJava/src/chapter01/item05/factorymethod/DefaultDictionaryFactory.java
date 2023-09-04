package chapter01.item05.factorymethod;

import chapter01.item05.Dictionary;

public class DefaultDictionaryFactory implements DictionaryFactory {

	@Override
	public Dictionary getDictionary() {
		return new DefaultDictionary();
	}
	
}
