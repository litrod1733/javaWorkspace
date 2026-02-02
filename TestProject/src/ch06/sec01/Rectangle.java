package ch06.sec01;

import java.util.Scanner;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {}
	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	public int area() {
		return this.width * this.height;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("input width: ");
		this.width = sc.nextInt();
		System.out.print("input height: ");
		this.height = sc.nextInt();
		
		sc.close();
	}
}
