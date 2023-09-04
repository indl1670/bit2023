package chapter01.item05.springioc;

public class App {

	public static void main(String[] args) {
		
		// 스프링이 모르는 객체
		// SpellChecker spellCherker = new SpellChecker();
		
		// 스프링 Bean
		ApplicationiContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		SpellChecker spellChecker = applicationContext.getBean(SpellChecker.class); // 싱글톤
		spellChecker.isValid("test");

	}

}
