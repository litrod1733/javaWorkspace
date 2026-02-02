package exPackage.game_project.start;

import java.util.Scanner;

import exPackage.game_project.game.GaBaBo;
import exPackage.game_project.game.Guess;
import exPackage.game_project.info.AppInfo;

public class AppStart {
	public static void main(String[] args) {
		int option = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******************************************");
		System.out.println("       ** 게임에 오신 것을 환영합니다^^ **");		
		
		do  {
			System.out.println("******************************************");
			System.out.println("                   메뉴");
			System.out.println("------------------------------------------");
			System.out.println("1. 애플리케이션 정보");
			System.out.println("2. 가위바위보 게임");
			System.out.println("3. 숫자 알아맞히기 게임");
			System.out.println("4. 종료");
			System.out.println("------------------------------------------");
			System.out.print("메뉴 번호 입력: ");
			option = sc.nextInt();
			switch(option) {
				case 1: AppInfo.printInfo(); break;
				case 2: GaBaBo.printStart(); break;
				case 3: Guess.printStart(); break;
			}
		} while (option != 4);
		System.out.println("******************************************");
		System.out.println("                종료합니다!");
		System.out.println("******************************************");
		sc.close();
	}
}
