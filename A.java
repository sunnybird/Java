
public class A {

	static{
		System.out.println("11");
	}
	
	{
		System.out.println("22");
	}
	public A(){
		System.out.println("33");
	}
	public void deal(){
		System.out.println("44");
	}
	
	public class B extends A{
		/*static{
			System.out.println("55");
		}*/
		
		{
			System.out.println("66");
		}
		public B(){
			System.out.println("77");
		}
		public void deal(){
			System.out.println("88");
		}
		
		
	}
	public class C {
		
		
	}
	
	public static void main(String [] args ){
			
		A a = new A().new B();
		a.deal();
	}
}
============================================================================
==============================================================================
11
22
33
22
33
66
77
88
