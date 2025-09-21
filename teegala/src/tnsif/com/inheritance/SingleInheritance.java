package tnsif.com.inheritance;

class Single{
	public void singleMethod() {
		System.out.println(" Single Inheritance");
	}
}
class B extends Single{
	public void singleMethod1() {
		System.out.println(" Single Inheritance from  singleMethod1");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		B obj= new B();
		
		obj.singleMethod();
		obj.singleMethod1();
	}

}