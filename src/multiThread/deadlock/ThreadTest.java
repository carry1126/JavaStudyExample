package multiThread.deadlock;

/*
 * 데드락
 */
public class ThreadTest {

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public static void main(String[] args) throws Exception {
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		
		T1.start();
		T2.start();
	}
	
	private static class ThreadDemo1 extends Thread{
		public void run() {
			//Lock1 객체에 Lock이 걸림
			synchronized(Lock1) {
				System.out.println("Thread 1: Holding Lock1..");
				
				try {
					Thread.sleep(10);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Thread 1: Waiting for Lock2..");
				synchronized(Lock2) {
					System.out.println("Thread 1: Holding Lock1 & Lock2");
				}
			}
		}
	}
	
	public static class ThreadDemo2 extends Thread {
		public void run() {
			//Lock2 객체에 Lock이 걸림
			synchronized(Lock2) {
				System.out.println("Thread 2: Holding Lock2..");
				
				try {
					Thread.sleep(10);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 2: Waiting for Lock1..");
				synchronized(Lock1) {
					System.out.println("Thread 2: Holding Lock1 & Lock2..");
				}
			}
		}
	}
}
