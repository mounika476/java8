package java8;

interface Demo4
{
	void save();
}

public class MethodReference  
{		
	public void hello(){
		
		System.out.println(" hello method reference");
	}
	
		public static void Something()
		{
			System.out.println("Something Special");
		}
		
		public static void main(String[] args) 
		{
			MethodReference mf=new MethodReference();
			Demo4 d4=mf::hello;
			
			Demo4 d5=MethodReference::Something;
			
			
			d4.save();
			d5.save();
			
		}
}
