package java8;

import java.util.function.BiFunction;
import java.util.function.Function;

 class adder{
	 
	 public int add(int a, int b){
		 
		 return a+b;
	 }
	 
	 public int show(int c)
	 {
		 return c;
	 }
	 
	 
	 
	
}

public class BiFunctionRef {

	public static void main(String[] args) {
		
		adder adder=new adder();     //here BiFunction is a predefined function interface
		                             // which accept 3 arguments and produces results
		                             // by using apply() of return type int.
		
		BiFunction<Integer,Integer, Integer> Bf1=adder::add;
		
		
		int result=Bf1.apply(10,20);
		System.out.println(result);
		
		
		Function<Integer,Integer> f=adder::show;  //Function also a predefined functional Integer
		
		int result1=f.apply(40);
		
		System.out.println(result1);

	}

}
