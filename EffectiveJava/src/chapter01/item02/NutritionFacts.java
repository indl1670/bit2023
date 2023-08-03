package chapter01.item02;

public class NutritionFacts {
	// 필수
	private final int servingSize;
	private final int servings;
	// 선택
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	public static class Builder {
		private final int servingSize;
		private final int servings;
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;
		
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		// setter와 동일한 역할
		public Builder calories(int val) {
			calories = val;
			return this;
		}
		public Builder fat(int val) {
			fat = val;
			return this;
		}
		public Builder sodium(int val) {
			sodium = val;
			return this;
		}
		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}
		
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}
	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
	
	public static void main(String[] args) {
		// 필수값 제외 필요에 따라 추가 가능
		NutritionFacts cocaCola = new Builder(240, 0).
				calories(100).
				sodium(27).
				build();
	}
}
