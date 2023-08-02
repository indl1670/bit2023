package lotto;

public class Reward {
	public long totalReward; // 총 상금
	public int[] winningCount = new int[3]; // 등수별 인원
	public int[] winningReward = new int[3]; // 등수별 상금
	public final int third = 25000;
	
	public Reward(int userCount) {
		totalReward = 5000 * userCount; // 총 상금 책정
	}
	
	// 등수 인원 세팅
	public void setWinningCount(int rank) {
		if (rank == 1) {
			winningCount[0]++;
		} else if (rank == 2) {
			winningCount[1]++;
		} else if (rank == 3) {
			winningCount[2]++;
		}
	}
	public int[] getWinningCount() {
		return winningCount;
	}
	// 등수별 상금 세팅
	public void setWinningReward() {
		winningReward[2] = third; // 3등 고정 상금
		
		totalReward -= winningCount[2] * third; // 3등 상금 제외한 나머지 상금
		
		if (winningCount[0] == 0) {
			winningReward[0] = (int) Math.floor(totalReward * 0.7);
		} else {
			winningReward[0] = (int) (Math.floor(totalReward * 0.7)/winningCount[0]); // 1등 상금
		}
		if (winningCount[1] == 0) {
			winningReward[1] = (int) Math.floor(totalReward * 0.3);
		} else {
			winningReward[1] = (int) (Math.floor(totalReward * 0.3)/winningCount[1]); // 2등 상금
		}
		
	}
	public int[] getWinningReward() {
		return winningReward;
	}
}
