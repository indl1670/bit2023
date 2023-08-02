package lotto;

public class User {
	public int[] nums = new int[5];
	public int id;
	public int rank;
	
	public User(int id, int[] nums) {
		this.id = id;
		this.nums = nums;
	}
	
	public int[] getMyNums() {
		return this.nums;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getRank() {
		return this.rank;
	}
}
