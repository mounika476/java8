package java8;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1[]=new String[10];
		S1[5]="HellloJK";
		
		  Optional<String> checkNull = Optional.ofNullable(S1[5]);  
		  
		  
		  System.out.println(checkNull.get());
		  if(checkNull.isPresent()){
		    
			  String S2=S1[5].toLowerCase();
		  
		  
		System.out.println(S2);
		
		  }
		  
		  else{
			  
			  System.out.println("String is not present at given index");
		  }

	}

}
