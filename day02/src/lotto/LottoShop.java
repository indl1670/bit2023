package lotto;

import java.io.*;
import java.util.*;

public class LottoShop {
	public int[] winningNums = new int[5]; // 당첨번호
	public final int userCount = 100; // 총 사용자 수
	
	
	User[] users = new User[userCount];
	Reward reward = new Reward(userCount);
	
	public LottoShop() throws Exception {
//		winningNums = getRandomNums();
//		System.out.println(Arrays.toString(winningNums));
		
		users[0] = new User(0, buyLotto()); // 로또 구매
		
		// 나머지 사용자들 로또 번호 입력
		for(int i = 1; i < userCount; i++) {
			users[i] = new User(i, getRandomNums());
		}
		
		// 당첨번호 세팅
		winningNums = getRandomNums();
				

		// 개인 등수 판별
		for(int i = 0; i < userCount; i++) {
			int cnt = 0;
			int[] nums = users[i].getMyNums();
			for(int j = 0; j < 5; j++) {
				for(int k = 0; k < 5; k++) {
					if (nums[j] == winningNums[k]) {
						cnt++;
					}
				}
			}
			if (cnt == 5) {
				users[i].setRank(1);
				reward.setWinningCount(1);
			} else if (cnt == 4) {
				users[i].setRank(2);
				reward.setWinningCount(2);
			} else if (cnt == 3) {
				users[i].setRank(3);
				reward.setWinningCount(3);
			}
			
		}
		// 상금 세팅
		reward.setWinningReward();
	}
	// 로또 번호 수기 입력
	public int[] buyLotto() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] myNums = new int[5];
		// 내 로또번호 입력
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 5; i++) {
			myNums[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if (i == j) continue;
				if (myNums[i] == myNums[j]) {
					System.out.println("중복숫자 없이 입력해주세요.");
					System.out.println("로또 번호(1 ~ 40) 5자리를 중복되지 않게 입력해주세요.(띄어쓰기 구분)");
					return buyLotto(); // 중복 숫자 입력 시 재입력 요청
				}
			}
		}
		return myNums;
		
	}
	// 로또 번호 자동 입력
	public int[] getRandomNums() {
		int[] nums = new int[5];
		Random r = new Random();
		
		for(int i = 0; i < 5; i++) {
			nums[i] = r.nextInt(40) + 1;
			for(int j = 0; j < i; j++) { // 중복 제거
				if (nums[i] == nums[j]) {
					i--;
				}
			}
		}
		
		return nums;
	}
}
