package chapter01.item05.springioc;

import org.springframework.context.annontation.Configuration;

import chapter01.item05.Dictionary;


// 스프링 설정 파일
@Configuration
public class AppConfig {
	
	@Bean
	public SpellChecker spellChecker(Dictionary dictionary) {
		return new SpellChecker(dictionary);
	}
	
	@Bean
	public Dictionary dictionary() {
		return new SpringDictionary();
	}
}
