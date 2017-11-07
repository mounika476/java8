package java8;

//interface Demo
//{
//	void m1();
//}
//  class Test
// {
//	public static void main(String[] args)
//	{
//		Demo d=() -> {
//			System.out.println("hello interface");
//		};
//
//		d.m1();
//	}
//}




//interface Drawable{  
//    public void draw();  
//}  
//public class Test {  
//    public static void main(String[] args) {  
//        int width=10;  
//  
//        //without lambda, Drawable implementation using anonymous class  
//        Drawable d=new Drawable(){  
//            public void draw(){System.out.println("Drawing "+width);}  
//        };  
//        d.draw();  
//    }  
//}  



interface Sayable
{
	public String say( String name);
}

class Test
{
	public static void main(String[] args)
	{
		Sayable s1 = (name) -> { return "hello" +name; };
		
		System.out.println(s1.say(" flowers"));
	}
}




//interface Addable
//{
//	public int add(int a,int b);
//}
//
//
//class Test
//{
//	public static void main(String[] args)
//	{
//		Addable a1 = (a,b)->(a+b); {
//			System.out.println(a1.add(10,20));
//		};
//		
//	}
//	
//}


