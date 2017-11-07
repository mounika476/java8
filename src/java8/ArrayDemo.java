package java8;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]={1,3,2,6,8,4,5};
		
		
		for(int i:a){
			System.out.print(i+" ");
		}
		
	
		Arrays.parallelSort(a,1,3);  
        System.out.println("\nArray elements after sorting");  
        // Iterating array elements  
        for (int i : a) {  
            System.out.print(i+" ");  
	
        }
	}

}
