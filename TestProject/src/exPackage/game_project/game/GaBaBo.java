package exPackage.game_project.game;

import java.util.Scanner;

public class GaBaBo {
	private static String gbb[] = {"가위", "바위", "보"};
	private static char answer;
	private static int choose;
	
	public GaBaBo() {}
	
	static Scanner sc = new Scanner(System.in);
	
	public static void printStart() {
		System.out.println("******************************************");
		System.out.println("               가위바위보 게임");
		System.out.println("가위/바위/보 게임: 1.가위 2.바위 3.보");
		while(answer != 'n') {
			do {
				System.out.println("==========================================");
				System.out.print("번호 입력: ");
				choose = sc.nextInt() - 1;
			} while(choose != 0 && choose != 1 && choose != 2);
			int computer = (int)(Math.random() * 3);
			if (choose == computer) {
				printDrawMsg(computer);
			} else if ((choose+1) % 3 == computer) {
				printLoseMsg(computer);
			} else {
				printWinMsg(computer);
			}
			System.out.print("계속하시겠습니까?(y/n): ");
			answer = sc.next().charAt(0);
			if(answer == 'n') {
				System.out.println("게임을 종료합니다.");
			}
		}
	}
	
	private static void printWinMsg(int com) {
		System.out.println("컴퓨터는 '" + gbb[com] + "'입니다.");
		System.out.println("당신이 이겼습니다^^");
	}
	private static void printLoseMsg(int com) {
		System.out.println("컴퓨터는 '" + gbb[com] + "'입니다.");
		System.out.println("컴퓨터가 이겼습니다T.T");
	}
	private static void printDrawMsg(int com) {
		System.out.println("컴퓨터는 '" + gbb[com] + "'입니다.");
		System.out.println("비겼습니다!");
	}
}
