package multiThread.asynchronize;

/*
 * Thread2
 */
public class People2 extends Thread {
	@Override
	public void run() {
		ThreadTest.myBank.withdraw(2000);		
		System.out.println("People2 출금 후 잔고:" +ThreadTest.myBank.balance);
	}
}
