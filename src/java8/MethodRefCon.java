package java8;


interface messaging{

	MethodRefCon message();
}



public class MethodRefCon {

	public MethodRefCon(){
		System.out.println("hello Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		messaging m=MethodRefCon::new;
		m.message();
		
	}

}
