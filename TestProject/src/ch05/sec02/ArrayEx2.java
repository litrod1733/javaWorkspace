package ch05.sec02;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottoNums[] = {0, 0, 0, 0, 0, 0};
		
		for (int i=0; i<6; i++ ) {
			lottoNums[i] = (int)(Math.random() * 45) + 1;
			
			for (int j=0; j<i; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("이번 주 로또 번호 >");
		for (int i=0; i<6; i++) {
			System.out.print(lottoNums[i] + " ");
		}
	}

}
