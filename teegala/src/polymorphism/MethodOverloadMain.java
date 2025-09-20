package polymorphism;

public class MethodOverloadMain {
	public static  void main (String [] args ) {
		MethodOverload m = new MethodOverload();
		m.hello();
		m.hello(2);
		m.hello(2.8f);
		
		m.hello(1,2.9f);
		m.hello(2.7f,3);
	}
}