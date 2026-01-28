package ch03.sec01;
import java.util.Scanner;


public class CompareOp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String pass = "1234";
		String userPass = "";
		
		System.out.print("비밀번호 입력: ");
		userPass = sc.nextLine();
		if(pass.equals(userPass)) {			// ==으로 비교하면 두 객체의 문자열의 내용이 아닌 참조하는 주소가 같은지를 비교함
			System.out.println("비밀번호가 일치합니다.");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		
		sc.close();
	}

}
