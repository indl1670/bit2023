package lotto;

public class User {
	public int[] myNums = new int[5];
	public int id;
	public int rank;
	
	public User(int id, int[] nums) {
		this.id = id;
		this.myNums = nums;
	}
	
	public int[] getMyNums() {
		return this.myNums;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getRank() {
		return this.rank;
	}
}
