/**
 * 该程序模拟线程死锁情况
 * */
public class LocalThread {

	public static void main(String[] args) {

		for(int i = 0 ; i < 100 ; i++){
			
			new Thread(new SynAddRunnable(1,2)).start();
			new Thread(new SynAddRunnable(2,1)).start();
		}

	}
	
	private static class SynAddRunnable implements Runnable{

		private int a,b;
		
		public SynAddRunnable(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}

		@Override
		public void run() {
	           	//发生死锁
			synchronized(Integer.valueOf(a)){
				synchronized(Integer.valueOf(b)){
					
					System.out.println(a+b);
				}
			}
		}
		
		
	}

}
