package Generics;

public class GenericMain {

	public static void main(String[] args) {
		//Integer type
		GenericDemo<Integer> num = new GenericDemo<>();
		num.setPrintElement(100);
		System.out.println(num.getPrintElement());
		
		//String type
		GenericDemo<String> str = new GenericDemo<>();
		str.setPrintElement("TNS");
		System.out.println(str.getPrintElement());

	}

}