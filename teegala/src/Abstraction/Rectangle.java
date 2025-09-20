package Abstraction;

public class Rectangle extends Shape {
	private int width=2,height=5;
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
		
	}
	void calArea() {
		super.area=width*height;
	}

}