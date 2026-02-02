package ch04.sec03;

public class Break2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter:for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
//					break;
					break Outter;
				}
			}
//			if (upper == 'K') break;
		}
	}

}
