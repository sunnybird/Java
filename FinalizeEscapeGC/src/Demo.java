/**
 * 本程序模拟对象可以逃脱一次垃圾回收
 **/
 
public class Demo {

	public static Demo demo = null;
	
	public void isAlive(){
		
		System.out.println("I am alive...........");
	}


	//进行对象拯救
	@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
		System.out.println("finalize()");
		Demo.demo = this;
	}
	public static void main(String [] args) throws InterruptedException{
		demo = new Demo();
		//第一次垃圾回收
		demo = null;
		System.gc();
		Thread.sleep(1000);
		if(demo != null){
			demo.isAlive();
		}
		else{
			System.out.println("I am died");
		}
		//第二次垃圾回收
		demo = null;
		System.gc();
		Thread.sleep(1000);
		if(demo != null){
			demo.isAlive();
		}
		else{
			System.out.println("I am died..........");
		}
		
		
	}
	
}
