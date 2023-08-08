package chapter01.item03.enumtype;

import java.lang.reflect.Constructor;

public class EnumElvisReflection {

	public static void main(String[] args) {
		try {
			Constructor<Elvis> declaredConstructor = Elvis.class.getDeclaredConstructor();
			System.out.println(declaredConstructor);
		} catch (NoSuchMethodException e) {
			// java.lang.NoSuchMethodException: chapter01.item03.enumtype.Elvis.<init>()
			e.printStackTrace();
		}

	}

}
