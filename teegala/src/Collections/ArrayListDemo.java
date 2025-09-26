package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(25);
		list.add(30);
		list.add(35);
		list.add(40);
		list.add(45);
		
		list.remove(4);
		
		
		System.out.println(list.size());
		
		System.out.println(list);
		
		
	
		
	}

}