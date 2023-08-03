package chapter01.item01;

import java.util.*;

public class FontFactory {

	private Map<String, Font> cache = new HashMap<>();
	
	// 자주 사용되는 것들 캐싱
	public Font getFont(String font) {
		if (cache.containsKey(font)) {
			return cache.get(font);
		} else {
			String[] split = font.split(":");
			Font newFont = new Font(split[0], Integer.parseInt(split[1]));
			cache.put(font,  newFont);
			return newFont;
		}
	}
}
