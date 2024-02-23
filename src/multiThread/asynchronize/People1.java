package multiThread.asynchronize;

/*
 * Thread1
 */
public class People1 extends Thread {
	@Override
	public void run() {
		ThreadTest.myBank.deposit(1000);
		System.out.println("People1 입금 후 잔고:" + ThreadTest.myBank.balance);
	}
}
