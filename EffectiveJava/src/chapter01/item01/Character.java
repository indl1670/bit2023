package chapter01.item01;

public class Character {
	// 자주 변경되는 속성
	private char value;
	private String color;
	// 자주 변경되지 않는 속성
	private Font font; // fontFamily & fontSize
	
	public Character(char value, String color, Font font) {
		this.value = value;
		this.color = color;
		this.font = font;
	}
	
	// 외부 호출 가정
	public static void main(String[] args) {
		FontFactory fontFactory = new FontFactory();
		Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
		Character c2 = new Character('e', "black", fontFactory.getFont("nanum:12"));
		Character c3 = new Character('l', "blue", fontFactory.getFont("nanum:12"));
	}
}
