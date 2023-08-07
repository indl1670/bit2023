package chapter01.item03;

import java.util.function.Supplier;

public class Concert {

	public void start(Supplier<Singer> singerSupplier) {
		Singer singer = singerSupplier.get();
		singer.sing();
	}
	
	public static void main(String[] args) {
		Concert concert = new Concert();
		// Supplier에 준하는 익명 Instance
		concert.start(() -> Elvis.getInstance());
	}
}
