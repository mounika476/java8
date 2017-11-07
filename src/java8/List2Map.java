package java8;

import java.util.*;
import java.util.stream.Collectors;

class Product1{
	
	public int id;
	public String name;
	public int price; 
	
	
	public Product1(int id,String name,int price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public String toString(){
		return id+" "+name+" "+price;
	}
	
}

public class List2Map {

	public static void main(String[] args) {
		
		
		ArrayList<Product1>  al=new ArrayList<Product1>();
		al.add(new Product1(1,"pen",5));
		al.add(new Product1(2,"pencil",6));
		al.add(new Product1(3,"bag",100));
		al.add(new Product1(4,"marker",25));
		
		System.out.println(al);
		
		/*Double Pricesum=al.stream().collect(Collectors.summingDouble(x->x.price));
		
		Integer Idsum=al.stream().collect(Collectors.ummingsInt(y->y.id));
		
		
		Long NoOfElements=al.stream().collect(Collectors.counting());
		
		Double AveragePrice=al.stream().collect(Collectors.averagingDouble(z->z.price));
		
		System.out.println("Sum of Price:"+Pricesum);
		
		System.out.println("Sum of IDS:"+Idsum);
		
		System.out.println("Number Of Elements:"+NoOfElements);
		
		System.out.println("Average Price is:"+AveragePrice);*/
		
		
		
		Map<Integer,String> map=al.stream().
				                collect(Collectors.toMap(p->p.id, p->p.name));
		
		System.out.println(map);
	}

}
