package ch04.sec03;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while(true) {
			// 무한반복일 경우 반복문 내부 코드에서 종료코드를 구성해야함
			if(i >100) break;
			System.out.println(i++);
		}
	}

}
