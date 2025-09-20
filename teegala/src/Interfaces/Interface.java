package Interfaces;

public interface Interface {
	int a =10;
	void show();
}

class sample implements Interface{
	public void show() {
		System.out.println("This is implementation class");
	}
}