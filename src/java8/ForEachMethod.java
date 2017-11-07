package java8;

import java.util.*;

public class ForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> Al=new ArrayList<String>();
		
		Al.add("cricket");
		Al.add("hockey");
		Al.add("tennis");
		Al.add("FootBall");
		Al.add("baseball");
		
		System.out.println(Al);
		
		/*Iterator itr=Al.iterator();    Iterating by using iterator
		while(itr.hasNext()){
			
			
			System.out.println(itr.next());
			
		}*/
		
		/*for(String S:Al){            Iterating by using for-each loop
			System.out.println(S);
		}*/
		
		Al.forEach( S->{            //Itearating by using for each() of 1.8
			System.out.println(S);
			});

	}

}
