package lotto;

import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static LottoShop ls;
	public static void main(String[] args) throws Exception {
		System.out.println("--------------------------");
		System.out.println("         로또 판매점         ");
		System.out.println("--------------------------");
		System.out.println("로또 번호(1 ~ 40) 5자리를 중복되지 않게 입력해주세요.(띄어쓰기 구분)");
		
		ls = new LottoShop();
		
		System.out.println();
		
		showMenu();
		

	}
	
	static void showMenu() throws Exception {
		while (true) {
			menuInfo();
			System.out.print("번호 선택: ");
			int cmd = Integer.parseInt(br.readLine());
			
			if (cmd == 1) {
				int myRank = ls.users[0].getRank();
				if (myRank == 1 || myRank == 2 || myRank == 3) {
					showMyResult(myRank);
				}
				else {
					System.out.println("아쉽게도 낙첨되었습니다.");
				}
			} else if (cmd == 2) {
				System.out.printf("1등 당첨 총 %d명\n", ls.reward.getWinningCount()[0]);
				System.out.printf("2등 당첨 총 %d명\n", ls.reward.getWinningCount()[1]);
				System.out.printf("3등 당첨 총 %d명\n", ls.reward.getWinningCount()[2]);
				
			} else if (cmd == 3) {
				System.out.println("감사합니다, 또 이용해주세요.");
				break;
				
			} else {
				System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요.");
			}
			System.out.println();
		}
	}
	static void menuInfo() {
		System.out.println("--------------------------");
		System.out.println("            메뉴           ");
		System.out.println("--------------------------");
		System.out.printf("오늘의 당첨 번호: %d %d %d %d %d\n", ls.winningNums[0], ls.winningNums[1], ls.winningNums[2], ls.winningNums[3], ls.winningNums[4]);
		System.out.println("1. 내 당첨 결과 확인하기");
		System.out.println("2. 전체 당첨 결과 확인하기");
		System.out.println("3. 종료");
	}
	static void showMyResult(int rank) {
		System.out.printf("%d등 당첨 축하합니다!\n", rank);
		System.out.printf("총 상금: %d원\n", ls.reward.getWinningReward()[0]);
	}

}
