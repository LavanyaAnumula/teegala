
public class A {
    public void show1()
    {
    	System.out.println("This is class A");
    }
}
class B extends A {
	public void show2()
	{
		System.out.println("This is class B extends from class A");
	}
}

class C extends B {
	public void show3()
	{
		System.out.println("This is class C extends from B");
	}
	
}