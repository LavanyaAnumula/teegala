package Streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Javastreamexample {
	
public static void main(String[] args) {
	
	List<Product> pl=new ArrayList<Product>();
	
	pl.add(new Product(1,"hp",25000f));
	pl.add(new Product(2,"Dell",30000f));
	pl.add(new Product(1,"Apple",95000f));
	pl.add(new Product(1,"lenova",15000f));
	
	List<Float> pl2=pl.stream().filter(p->p.price>30000)
			.map(p->p.price)
			.collect(Collectors.toList());
			System.out.println(pl2);
}
}
