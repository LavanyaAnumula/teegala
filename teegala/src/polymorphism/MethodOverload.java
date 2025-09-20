package polymorphism;

public class MethodOverload {
	public void hello() {
		System.out.println("This is first method");
	}
	
	public void hello(int a ) {
		System.out.println("This is second method" + a);
		
	}
	
	public void hello(float a ) {
		System.out.println("This is third method" + a);
		
	}
	
	public void hello(int a , float b) {
		System.out.println("This is second method" + a+ b);
	}
	
	public void hello(float a , int b) {
		System.out.println("This is second method" + a+ b);
	}
	
	
	
}
