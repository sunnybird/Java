
public class DeadlockSample {

	private final Object obj1 = new Object();
	private final Object obj2 = new Object();
	
	public static void main(String[] args){
		
		
		DeadlockSample dls = new DeadlockSample();
		dls.testDeadlock();
	}
	
	
	
	
	private void testDeadlock(){
		
		Thread t1 = new Thread(new Runnable(){
			
			
			public void run(){
				
				callLock2();
				
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			
			public void run(){
				callLock1();
				
			}
		});
		t1.start();
		t2.start();
	}
	
	private void callLock2(){
		
		synchronized(obj1){
			
			sleep();
			
			synchronized(obj2){
				
				sleep();
			}
		}
	}
	
	private void callLock1(){
		
		synchronized(obj2){
			sleep();
			synchronized(obj1){
				
				sleep();
				
				
			}
		}
	}
	
	private void sleep(){
		
		try{
			
			Thread.sleep(100);
		}
		catch(InterruptedException e){
			
			e.printStackTrace();
			
		}
	}
	
	
	
}
