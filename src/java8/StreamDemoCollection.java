package java8;

import java.util.*;
import java.util.stream.Collectors;

class Product{
	
	public int id;
	public String name;
	public int price; 
	
	
	public Product(int id,String name,int price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public String toString(){
		return id+" "+name+" "+price;
	}
	
}

public class StreamDemoCollection {

	public static void main(String[] args) {
		
		ArrayList<Product>  al=new ArrayList<Product>();
		al.add(new Product(1,"pen",5));
		al.add(new Product(2,"pencil",6));
		al.add(new Product(3,"bag",100));
		
		System.out.println(al);
		
		
		/*ArrayList<Integer> l= (ArrayList<Integer>) al.stream().filter(p -> p.price > 5)// filtering data  
                .map(p->p.price)        // fetching price  
                .collect(Collectors.toList());
		
		System.out.println(l);*/
		
		
		al.stream().filter(p->p.price >5).
		forEach(S->{
			System.out.println(S);
		});
		
		

	}

}
