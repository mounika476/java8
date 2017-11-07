package java8;

 interface Demo2 {
	default void m2(){
		System.out.println("this is default interface");
	}
	static void m3(){
		System.out.println("static interface method");
	}

	void m4();
}

	public class Test2 implements Demo2{
		public void m4(){
			System.out.println("this is abstract method");
		}
		 
		public static void main(String[] args) {
			Test2 t=new Test2();
			t.m2();
			t.m4();
			Demo2.m3();
		}
	}


//class Test2
//{
//	public static void m1()
//	{
//		System.out.println("hii static method");
//	}
//	
//	public static void main(String[] args)
//	{
//		Test2 t = new Test2();
//		Test2.m1();
//		t.m1();
//	}
//}

