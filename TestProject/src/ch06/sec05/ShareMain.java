package ch06.sec05;

public class ShareMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Share s1, s2;
		s1 = new Share();
		s2 = new Share();
		
		s1.set(1);
		System.out.println("s1.showA(): " + s1.showA() + "\ts1.showStaticA():" + s1.showStaticA());
		s2.set(2);
		System.out.println("s2.showA(): " + s2.showA() + "\ts2.showStaticA():" + Share.showStaticA());
	}

}
