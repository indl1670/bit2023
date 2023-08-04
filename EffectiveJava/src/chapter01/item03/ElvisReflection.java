package chapter01.item03;

import java.lang.reflect.Constructor;

public class ElvisReflection {
	
	public static void main(String[] args) {
		try {
			// Reflection으로 생성자 가져오기
			Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor();
			defaultConstructor.setAccessible(true);
			Elvis elvis1 = defaultConstructor.newInstance();
			Elvis elvis2 = defaultConstructor.newInstance();
			
			// 싱글톤 X
			System.out.println(elvis1 == elvis2); // false
			System.out.println(elvis1 == Elvis.INSTANCE); // false
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
