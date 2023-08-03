package chapter01.item02;

import java.util.Objects;

public class NyPizza extends Pizza{

	public enum Size {SMALL, MEDIUM, LARGE };
	private final Size size;
	
	// 자기 자신의 빌더 리턴
	public static class Builder extends Pizza.Builder<Builder> {
		private final Size size;
		public Builder(Size size) {
			this.size = Objects.requireNonNull(size);
		}
		
		@Override
		public NyPizza build() {
			return new NyPizza(this);
		}
		@Override
		protected Builder self() {
			return this;
		}
	}
	private NyPizza(Builder builder) {
		super(builder);
		size = builder.size;
	}
	
	@Override
	public String toString() {
		return toppings + "로 토핑한 피자";
	}

}
