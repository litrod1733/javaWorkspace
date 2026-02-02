package ch05.sec03;
import java.util.Scanner;

public class Array2DEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String quiz[][] = {{"chair","의자"},{"computer","컴퓨터"},{"integer","정수"}};
		Scanner sc = new Scanner(System.in);
		String ans = "";
		
		for (int i=0; i<quiz.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?: ", i, quiz[i][0]);
			ans = sc.next();
			if (quiz[i][1].equals(ans)) {
				System.out.println("정답입니다.");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.\n", quiz[i][1]);
			}
		}
		
		sc.close();
	}

}
