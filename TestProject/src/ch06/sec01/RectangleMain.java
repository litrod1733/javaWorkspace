package ch06.sec01;

public class RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle spongeBob = new Rectangle(10, 16);
		Rectangle squarePants = new Rectangle();
		
		squarePants.input();
		System.out.println(spongeBob.area());
		System.out.println(squarePants.area());
	}

}
