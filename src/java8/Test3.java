package java8;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("karthi");
		al.add("mouni");
		al.add("deeksha");
		al.add("assistix");
		al.forEach(ab->
			System.out.println(ab));
		

	}

}
