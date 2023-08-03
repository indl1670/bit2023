package chapter01.item01;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {
	public static void main(String[] args) {
		// ServiceLoader - 자바에서 기본적으로 제공하는 정적 팩토리 메서드
		// 현재 class path 내에 있는 모든 HelloService 내의 구현체 가져옴
		ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
		// Optional - NPE(Null Point Exception 방지)
		// 가장 첫 번째 구현체 가져옴
		Optional<HelloService> helloServiceOptional = loader.findFirst();
		// 다른 프로젝트에서 구현한 ChineseHelloService 구현체 가져옴
		helloServiceOptional.ifPresent(h -> {
			System.out.println(h.hello()); // Ni Hao
		});
	}	
}
